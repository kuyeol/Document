Now in Android 프로젝트에 사용자 생성 컨텐츠(게시/로드) 기능을 추가하기 위해 필요한 요소를 아키텍처 레이어별로 정리합니다. (Compose + Hilt + Room + Retrofit 기반)

1. 데이터 모델 추가 (Core Module)
// UserContent.kt

```kotlin
data class UserContent(
    val id: String,
    val title: String,
    val content: String,
    val authorId: String,
    val createdAt: Instant,
    val updatedAt: Instant,
    val likes: Int = 0,
    val mediaUrls: List<String> = emptyList()
)

// UserContentRequest.kt
data class UserContentRequest(
    val title: String,
    val content: String,
    val authorId: String,
    val mediaUrls: List<String> = emptyList()
)

2. API 인터페이스 확장 (Network Module)
// UserContentApiService.kt
interface UserContentApiService {
    @GET("user-contents")
    suspend fun getUserContents(
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 20
    ): NetworkResponse<List<UserContent>>

    @POST("user-contents")
    suspend fun postUserContent(
        @Body content: UserContentRequest
    ): NetworkResponse<UserContent>
}

3. Repository 계층 추가 (Data Module)
// UserContentRepository.kt
class UserContentRepositoryImpl @Inject constructor(
    private val network: UserContentApiService,
    private val userContentDao: UserContentDao
) : UserContentRepository {

    override fun getUserContentsStream(): Flow<List<UserContent>> =
        userContentDao.getUserContentsStream()
            .flatMapLatest { cachedData ->
                if (cachedData.isEmpty()) {
                    refreshUserContents()
                }
                userContentDao.getUserContentsStream()
            }

    override suspend fun refreshUserContents() {
        try {
            val response = network.getUserContents()
            if (response is NetworkResponse.Success) {
                userContentDao.upsertAll(response.data)
            }
        } catch (e: Exception) {
            throw UserContentRepositoryException("Failed to refresh contents", e)
        }
    }

    override suspend fun postUserContent(content: UserContentRequest): UserContent {
        return when (val response = network.postUserContent(content)) {
            is NetworkResponse.Success -> {
                userContentDao.upsert(response.data)
                response.data
            }
            is NetworkResponse.Error -> throw response.error
        }
    }
}

4. Use Case 추가 (Domain Module)
// GetUserContentsUseCase.kt
class GetUserContentsUseCase @Inject constructor(
    private val repository: UserContentRepository
) {
    operator fun invoke(): Flow<List<UserContent>> = repository.getUserContentsStream()
}

// PostUserContentUseCase.kt
class PostUserContentUseCase @Inject constructor(
    private val repository: UserContentRepository
) {
    suspend operator fun invoke(content: UserContentRequest): Result<UserContent> {
        return try {
            Result.success(repository.postUserContent(content))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

5. UI 레이어 확장 (UI Module)
ViewModel
// UserContentViewModel.kt
@HiltViewModel
class UserContentViewModel @Inject constructor(
    getUserContents: GetUserContentsUseCase,
    private val postUserContent: PostUserContentUseCase
) : ViewModel() {

    val userContents: Flow<List<UserContent>> = getUserContents()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    fun createContent(title: String, content: String) = viewModelScope.launch {
        val request = UserContentRequest(
            title = title,
            content = content,
            authorId = getCurrentUserId() // 인증 정보에서 사용자 ID 추출
        )
        postUserContent(request)
            .onSuccess { /* 업로드 성공 처리 */ }
            .onFailure { /* 에러 처리 */ }
    }
}

Compose UI
// UserContentScreen.kt
@Composable
fun UserContentScreen(
    viewModel: UserContentViewModel = hiltViewModel()
) {
    val userContents by viewModel.userContents.collectAsState()

    LazyColumn {
        items(userContents) { content ->
            UserContentItem(content)
        }
    }

    FloatingActionButton(onClick = { /* 작성 화면 이동 */ }) {
        Icon(Icons.Default.Add, "Create Content")
    }
}

6. 로컬 저장소 확장 (Database Module)
// UserContentDao.kt
@Dao
interface UserContentDao {
    @Query("SELECT * FROM user_content ORDER BY createdAt DESC")
    fun getUserContentsStream(): Flow<List<UserContent>>

    @Upsert
    suspend fun upsertAll(contents: List<UserContent>)

    @Upsert
    suspend fun upsert(content: UserContent)
}

// Database 확장
@Database(
    entities = [UserContent::class, ...], // 기존 엔티티 유지
    version = 2 // 버전 업그레이드
)
abstract class NiaDatabase : RoomDatabase() {
    abstract fun userContentDao(): UserContentDao
    // 기존 DAO 유지
}

7. Dependency Injection 설정 (Hilt Module)
// NetworkModule.kt 확장
@Module
@InstallIn(SingletonComponent::class)
object UserContentNetworkModule {
    @Provides
    fun provideUserContentApiService(retrofit: Retrofit): UserContentApiService =
        retrofit.create(UserContentApiService::class.java)
}

// DatabaseModule.kt 확장
@Module
@InstallIn(SingletonComponent::class)
object UserContentDatabaseModule {
    @Provides
    fun provideUserContentDao(database: NiaDatabase): UserContentDao =
        database.userContentDao()
}

8. 필요한 수정 사항
Gradle 종속성 추가:
// 모듈별 필요한 종속성 체크
implementation "com.google.accompanist:accompanist-pager:0.28.0" // 미디어 페이징
implementation "com.google.accompanist:accompanist-permissions:0.28.0" // 미디어 접근 권한

네트워크 정책 업데이트:
<!-- AndroidManifest.xml -->
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

데이터베이스 마이그레이션:
// Database Migration 처리
val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("""
            CREATE TABLE IF NOT EXISTS `user_content` (
                `id` TEXT PRIMARY KEY NOT NULL,
                `title` TEXT NOT NULL,
                `content` TEXT NOT NULL,
                `authorId` TEXT NOT NULL,
                `createdAt` TEXT NOT NULL,
                `updatedAt` TEXT NOT NULL,
                `likes` INTEGER NOT NULL,
                `mediaUrls` TEXT NOT NULL
            )
        """)
    }
}
```

9. Now in Android 구조와의 통합 포인트
인증 시스템 연동:

AuthManager와 사용자 ID 연동
API 요청 시 JWT 토큰 자동 주입
공유 컴포넌트 활용:

기존 NetworkMonitor를 이용한 오프라인 상태 처리
Dispatchers 인젝션을 통한 스레드 관리
테스트 인프라 재사용:

TestDispatcher를 이용한 코루틴 테스트
FakeUserContentRepository 구현
디자인 시스템 확장:

기존 NiaTheme에 맞는 새로운 컴포넌트 스타일링
NiaIcon 시스템 활용
10. 추천 아키텍처 패턴
[UI Layer] ← ViewModel ↔ [Domain Layer] ← Use Cases ↔ [Data Layer]
                │                              │
                └───────── StateFlow ──────────┘

Now in Android의 기존 아키텍처에 완벽히 통합되도록 다음 원칙을 유지해야 합니다:

단방향 데이터 흐름 (UDF)
불변 데이터 모델
의존성 역전 원칙 (DIP)
반응형 프로그래밍
테스트 용이성
이 구조는 기존 뉴스 피드 시스템과 유사한 패턴을 따르면서도 사용자 생성 컨텐츠의 특수성(미디어 업로드, 실시간 상호작용 등)을 고려한 확장이 필요합니다. 특히 미디어 처리를 위해 Coil이나 Glide와의 통합, 파일 업로드 관리 시스템 추가를 고려해야 합니다.





