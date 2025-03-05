# 안드로이드 네트워크 처리 가이드

안드로이드에서 네트워크 요청 및 응답 처리를 위한 기본 구현 방법을 안내해드리겠습니다. 
Retrofit2 + Kotlin Coroutines + MVVM 패턴을 기반으로 설명합니다.

## 1. Gradle 설정 (build.gradle)
```markdown
// Retrofit & OkHttp
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.squareup.okhttp3:logging-interceptor:4.10.0'

// Coroutines
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'

// ViewModel
implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1'
```

## 2. 데이터 모델 클래스
```kotlin
data class Content(
    val id: String,
    val title: String,
    val body: String,
    val userId: String,
    val createdAt: String
)

data class ContentRequest(
    val title: String,
    val body: String,
    val userId: String
)
```

## 3. API 인터페이스 정의
```kotlin
interface ContentApiService {
    @GET("contents")
    suspend fun getContents(): Response<List<Content>>

    @POST("contents")
    suspend fun createContent(
        @Body content: ContentRequest
    ): Response<Content>
}
```

## 4. Retrofit Client 설정
```kotlin
object RetrofitClient {
    private const val BASE_URL = "https://your-backend-server.com/api/"

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    val instance: ContentApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ContentApiService::class.java)
    }
}
```

## 5. Repository 계층
```kotlin
class ContentRepository {
    private val apiService = RetrofitClient.instance

    suspend fun postContent(content: ContentRequest): Result<Content> {
        return try {
            val response = apiService.createContent(content)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Server error: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun loadContents(): Result<List<Content>> {
        return try {
            val response = apiService.getContents()
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Server error: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
```

## 6. ViewModel 구현
```kotlin
class ContentViewModel : ViewModel() {
    private val repository = ContentRepository()
    
    private val _contents = MutableStateFlow<List<Content>>(emptyList())
    val contents: StateFlow<List<Content>> = _contents

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _error = MutableSharedFlow<String>()
    val error: SharedFlow<String> = _error

    fun loadContents() {
        viewModelScope.launch {
            _isLoading.value = true
            when (val result = repository.loadContents()) {
                is Result.Success -> _contents.value = result.data
                is Result.Failure -> _error.emit(result.exception.message ?: "Unknown error")
            }
            _isLoading.value = false
        }
    }

    fun postContent(content: ContentRequest) {
        viewModelScope.launch {
            _isLoading.value = true
            when (val result = repository.postContent(content)) {
                is Result.Success -> loadContents() // Refresh after post
                is Result.Failure -> _error.emit(result.exception.message ?: "Unknown error")
            }
            _isLoading.value = false
        }
    }
}
```

## 7. UI 구현 예시 (Fragment)
```kotlin
class ContentFragment : Fragment() {
    private val viewModel: ContentViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 콘텐츠 로드
        viewModel.loadContents()

        // 관찰 설정
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.contents.collect { contents ->
                    updateContentList(contents)
                }
            }
        }

        // 에러 처리
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.error.collect { errorMessage ->
                    showErrorToast(errorMessage)
                }
            }
        }
    }

    private fun updateContentList(contents: List<Content>) {
        // RecyclerView 업데이트 로직
    }

    private fun showErrorToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    // 컨텐츠 생성 예시
    private fun handleCreateContent() {
        val content = ContentRequest(
            title = "제목",
            body = "내용",
            userId = "user123"
        )
        viewModel.postContent(content)
    }
}
```

## 8. AndroidManifest.xml 권한 추가
```xml
<uses-permission android:name="android.permission.INTERNET" />
```

## 주요 기능 설명
### 컨텐츠 게시
- 사용자 입력을 ContentRequest 객체로 변환
- ViewModel을 통해 Repository에 전달
- 서버 응답에 따라 자동 리프레시

### 컨텐츠 로드
- 앱 실행 시 또는 새로고침 시 자동 로드
- 로딩 상태 관리
- 에러 핸들링

### 상태 관리
- 로딩 상태 표시
- 에러 메시지 토스트 표시
- 데이터 변경 시 UI 자동 갱신

## 개선 사항
### 네트워크 상태 확인
```kotlin
val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
val activeNetwork = connectivityManager.activeNetworkInfo
val isConnected = activeNetwork?.isConnectedOrConnecting == true
```

### 토큰 기반 인증 추가
```kotlin
// OkHttpClient에 Interceptor 추가
.addInterceptor { chain ->
    val request = chain.request().newBuilder()
        .addHeader("Authorization", "Bearer $authToken")
        .build()
    chain.proceed(request)
}
```

### 페이징 처리
```kotlin
@GET("contents")
suspend fun getContents(
    @Query("page") page: Int,
    @Query("size") size: Int
): Response<List<Content>>
```

### 캐싱 전략 추가
```kotlin
val cacheSize = 10 * 1024 * 1024 // 10MB
val cache = Cache(File(context.cacheDir, "http-cache"), cacheSize.toLong())
```

이 코드는 기본적인 구현 예시이며, 실제 프로젝트에서는 보안 강화, 에러 처리 개선, 성능 최적화 등을 추가로 구현해야 합니다. 백엔드 API 명세에 따라 엔드포인트 및 요청/응답 형식을 조정해야 합니다.

이어서 네트워크 관련 고급 구현 사항과 최적화 방법을 설명드리겠습니다. 기존 구현에서 더 발전된 기능들을 추가해보겠습니다.

## 9. 확장된 에러 핸들링
```kotlin
// 커스텀 예외 클래스
sealed class NetworkException : Exception() {
    data class HttpError(val code: Int, val message: String) : NetworkException()
    object NetworkConnectionError : NetworkException()
    data class UnexpectedError(val origin: Throwable) : NetworkException()
}

// 확장된 Repository 처리
class ContentRepository {
    suspend fun loadContents(): Flow<Result<List<Content>>> = flow {
        try {
            if (!isNetworkAvailable()) {
                throw NetworkException.NetworkConnectionError
            }
            
            val response = apiService.getContents()
            when {
                response.isSuccessful -> emit(Result.success(response.body()!!))
                else -> throw NetworkException.HttpError(
                    code = response.code(),
                    message = response.errorBody()?.string() ?: "Unknown error"
                )
            }
        } catch (e: Exception) {
            when (e) {
                is SocketTimeoutException -> emit(Result.failure(NetworkException.HttpError(408, "Timeout")))
                is UnknownHostException -> emit(Result.failure(NetworkException.NetworkConnectionError))
                is NetworkException -> emit(Result.failure(e))
                else -> emit(Result.failure(NetworkException.UnexpectedError(e)))
            }
        }
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo?.isConnectedOrConnecting == true
    }
}
```

## 10. 인증 처리 (JWT 토큰 관리)
```kotlin
// AuthInterceptor 구현
class AuthInterceptor(private val authHolder: AuthHolder) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer ${authHolder.getToken()}")
            .build()
        
        val response = chain.proceed(request)
        
        // 토큰 만료 시 갱신
        if (response.code == 401) {
            synchronized(this) {
                val newToken = refreshToken(authHolder.getRefreshToken())
                authHolder.saveToken(newToken)
                return intercept(chain)
            }
        }
        return response
    }

    private fun refreshToken(refreshToken: String): String {
        // 토큰 갱신 API 호출 로직
    }
}

// Retrofit Client 수정
private val okHttpClient = OkHttpClient.Builder()
    .addInterceptor(AuthInterceptor(authHolder))
    .addInterceptor(HttpLoggingInterceptor())
    .build()
```

## 11. 페이징 처리 (Paging3 통합)
```gradle
implementation "androidx.paging:paging-runtime-ktx:3.1.1"
implementation "androidx.paging:paging-compose:3.1.1" // Compose 사용 시
```

```kotlin
// Paging Source 구현
class ContentPagingSource(
    private val apiService: ContentApiService
) : PagingSource<Int, Content>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Content> {
        return try {
            val page = params.key ?: 0
            val response = apiService.getContents(page = page, size = params.loadSize)
            
            LoadResult.Page(
                data = response.body()!!,
                prevKey = if (page > 0) page - 1 else null,
                nextKey = if (!response.body().isNullOrEmpty()) page + 1 else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}

// ViewModel에서 사용
class ContentViewModel : ViewModel() {
    val contentPager = Pager(PagingConfig(pageSize = 20)) {
        ContentPagingSource(RetrofitClient.instance)
    }.flow.cachedIn(viewModelScope)
}
```

## 12. 캐싱 전략 구현
```kotlin
// OkHttp 캐시 설정
val cacheSize = 10 * 1024 * 1024 // 10MB
val cache = Cache(File(context.cacheDir, "http_cache"), cacheSize.toLong())

private val okHttpClient = OkHttpClient.Builder()
    .cache(cache)
    .addInterceptor { chain ->
        val request = chain.request()
        val cacheControl = if (isNetworkAvailable()) {
            // 온라인: 최대 1분 캐시
            CacheControl.Builder().maxAge(1, TimeUnit.MINUTES).build()
        } else {
            // 오프라인: 7일간 캐시 사용
            CacheControl.Builder().maxStale(7, TimeUnit.DAYS).build()
        }
        request.newBuilder()
            .cacheControl(cacheControl)
            .build()
            .let { chain.proceed(it) }
    }
    .build()
```

## 13. 실시간 업데이트 (WebSocket 연동)
```kotlin
// WebSocket 리스너
class ContentWebSocketListener : WebSocketListener() {
    override fun onMessage(webSocket: WebSocket, text: String) {
        // 새 컨텐츠 알림 수신
        val newContent = Gson().fromJson(text, Content::class.java)
        viewModel.handleNewContent(newContent)
    }
}

// WebSocket 연결 관리
object WebSocketManager {
    private val client = OkHttpClient()
    private var webSocket: WebSocket? = null

    fun connect() {
        val request = Request.Builder()
            .url("wss://your-server.com/updates")
            .build()
        
        webSocket = client.newWebSocket(request, ContentWebSocketListener())
    }

    fun disconnect() {
        webSocket?.close(1000, "Normal closure")
    }
}
```

## 14. 보안 강화 (Certificate Pinning)
```kotlin
// 인증서 고정 설정
private val okHttpClient = OkHttpClient.Builder()
    .certificatePinner(
        CertificatePinner.Builder()
            .add("your-domain.com", "sha256/AAAAAAAAAAAAAAAAAAAAAAAA=")
            .build()
    )
    .build()
```

## 15. 모의 테스트 환경 구성
```kotlin
// MockWebServer 설정
@RunWith(AndroidJUnit4::class)
class ContentApiTest {
    private lateinit var mockWebServer: MockWebServer
    private lateinit var apiService: ContentApiService

    @Before
    fun setup() {
        mockWebServer = MockWebServer()
        mockWebServer.start()
        
        apiService = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ContentApiService::class.java)
    }

    @Test
    fun testGetContents() = runBlocking {
        // 모의 응답 설정
        val mockResponse = MockResponse()
            .setBody("[{...}]")
            .setResponseCode(200)
        mockWebServer.enqueue(mockResponse)

        val response = apiService.getContents()
        assertTrue(response.isSuccessful)
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}
```

## 16. 고급 상태 관리 (UI State 패턴)
```kotlin
sealed class ContentState {
    object Idle : ContentState()
    object Loading : ContentState()
    data class Success(val data: List<Content>) : ContentState()
    data class Error(val message: String) : ContentState()
}

// ViewModel 상태 관리
class ContentViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<ContentState>(ContentState.Idle)
    val uiState: StateFlow<ContentState> = _uiState

    fun loadContents() {
        viewModelScope.launch {
            _uiState.value = ContentState.Loading
            repository.loadContents().collect { result ->
                _uiState.value = when (result) {
                    is Result.Success -> ContentState.Success(result.data)
                    is Result.Failure -> ContentState.Error(
                        (result.exception as? NetworkException)?.message 
                            ?: "Unknown error"
                    )
                }
            }
        }
    }
}
```

## 17. 네트워크 호출 모니터링
```kotlin
// 커스텀 이벤트 트래킹
class NetworkMonitorInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val startTime = System.nanoTime()
        
        val response = chain.proceed(request)
        
        val duration = (System.nanoTime() - startTime) / 1e6
        logNetworkEvent(
            url = request.url.toString(),
            method = request.method,
            statusCode = response.code,
            duration = duration
        )
        
        return response
    }

    private fun logNetworkEvent(
        url: String,
        method: String,
        statusCode: Int,
        duration: Double
    ) {
        // Firebase Analytics 또는 내부 모니터링 시스템 연동
    }
}
```

## 구현 시 고려사항
- 백그라운드 제한: WorkManager를 사용한 지연 요청 처리
- 데이터 무결성: Optimistic UI 업데이트 구현
- 로컬 데이터베이스: Room과의 동기화 처리 (NetworkBoundResource 패턴)
- 멀티파트 요청: 파일 업로드 기능 확장
- API 버저닝: 헤더에 API 버전 정보 추가
- 국제화: Accept-Language 헤더 처리
- 재시도 정책: Exponential backoff 알고리즘 적용

```kotlin
// 재시도 정책 예시
val okHttpClient = OkHttpClient.Builder()
    .retryOnConnectionFailure(true)
    .addInterceptor { chain ->
        var response: Response
        var retryCount = 0
        do {
            response = chain.proceed(chain.request())
            if (!response.isSuccessful && retryCount < 3) {
                retryCount++
                Thread.sleep(1000L * retryCount) // 점진적 대기
            } else {
                break
            }
        } while (true)
        response
    }
    .build()
```

이러한 확장 기능들을 통해 프로덕션 레벨의 안정적인 네트워크 레이어를 구축할 수 있습니다. 실제 구현 시에는 앱의 특성과 서버 API의 요구사항에 맞게 적절히 조정해야 합니다. 특히 보안 관련 요소와 에러 처리 로직은 철저하게 검증해야 합니다.

## 16. Dependency Injection with Hilt
의존성 주입을 통해 Retrofit 인스턴스와 Repository를 효율적으로 관리합니다.

```kotlin
// Hilt Module 설정
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor())
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://your-api.com/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ContentApiService {
        return retrofit.create(ContentApiService::class.java)
    }
}

// ViewModel 주입
@HiltViewModel
class ContentViewModel @Inject constructor(
    private val repository: ContentRepository
) : ViewModel() { ... }
```

## 17. 파일 업로드 (Multipart 요청)
이미지/파일 업로드 기능을 구현합니다.

```kotlin
// API 인터페이스 확장
@Multipart
@POST("upload")
suspend fun uploadFile(
    @Part file: MultipartBody.Part,
    @Part("description") description: RequestBody
): Response<UploadResponse>

// 파일 업로드 처리
val file = File("path/to/file.jpg")
val requestFile = file.asRequestBody("image/jpeg".toMediaType())
val part = MultipartBody.Part.createFormData("file", file.name, requestFile)

val response = apiService.uploadFile(
    part,
    RequestBody.create("text/plain".toMediaType(), "파일 설명")
)
```

## 18. 오프라인 지원 & 데이터 동기화
Room 데이터베이스와 네트워크 동기화를 결합합니다.

```kotlin
// NetworkBoundResource 구현
abstract class NetworkBoundResource<T> {
    fun asFlow(): Flow<Resource<T>> = flow {
        emit(Resource.Loading)
        val dbValue = loadFromDb().first()
        if (shouldFetch(dbValue)) {
            try {
                val apiResponse = fetchFromNetwork()
                saveToDb(apiResponse)
            } catch (e: Exception) {
                emit(Resource.Error(e))
            }
        }
        emitAll(loadFromDb().map { Resource.Success(it) })
    }
    
    protected abstract suspend fun fetchFromNetwork(): T
    protected abstract fun loadFromDb(): Flow<T>
    protected abstract suspend fun saveToDb(data: T)
    protected abstract fun shouldFetch(data: T?): Boolean
}
```

## 19. Ktor 클라이언트 활용
Retrofit 대체제로 Ktor를 사용한 네트워킹:

```kotlin
val client = HttpClient(CIO) {
    install(JsonFeature) {
        serializer = GsonSerializer()
    }
    install(Logging) {
        level = LogLevel.ALL
    }
}

suspend fun loadContents(): List<Content> {
    return client.get("https://api.com/contents")
}
```

## 20. 고급 재시도 메커니즘
Exponential Backoff를 적용한 재시도 정책:

```kotlin
private suspend fun <T> retryWithBackoff(
    block: suspend () -> T,
    maxRetries: Int = 3,
    initialDelay: Long = 1000
): T {
    var currentDelay = initialDelay
    repeat(maxRetries) { retryCount ->
        try {
            return block()
        } catch (e: Exception) {
            if (retryCount == maxRetries - 1) throw e
            delay(currentDelay)
            currentDelay *= 2
        }
    }
    throw IllegalStateException("Unreachable")
}

// 사용 예시
retryWithBackoff {
    apiService.getContents()
}
```

## 21. 네트워크 상태 모니터링
실시간 네트워크 연결 상태 감지:

```kotlin
class NetworkMonitor(context: Context) {
    private val connectivityManager = context.getSystemService<ConnectivityManager>()

    val networkStatus: Flow<Boolean> = callbackFlow {
        val callback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                trySend(true)
            }
            override fun onLost(network: Network) {
                trySend(false)
            }
        }
        connectivityManager.registerDefaultNetworkCallback(callback)
        awaitClose {
            connectivityManager.unregisterNetworkCallback(callback)
        }
    }
}
```

## 22. 성능 최적화 기법
GZIP 압축 활성화:
```kotlin
OkHttpClient.Builder()
    .addInterceptor(GzipInterceptor())
```

Protocol Buffers 사용:
```gradle
implementation 'com.squareup.retrofit2:converter-protobuf:2.9.0'
```

## 23. 백그라운드 동기화 (WorkManager)
주기적 데이터 동기화 구현:

```kotlin
class SyncWorker(appContext: Context, params: WorkerParameters)
    : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        return try {
            repository.syncData()
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }
}

// 작업 스케줄링
val request = PeriodicWorkRequestBuilder<SyncWorker>(1, TimeUnit.HOURS).build()
WorkManager.getInstance(context).enqueue(request)
```

## 24. 보안 강화 조치
토큰 안전 저장:

```kotlin
// EncryptedSharedPreferences 사용
val masterKey = MasterKey.Builder(context)
    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
    .build()

val sharedPreferences = EncryptedSharedPreferences.create(
    context,
    "secret_shared_prefs",
    masterKey,
    EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
    EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
)
```

Certificate Transparency 검증:

```kotlin
OkHttpClient.Builder()
    .certificatePinner(CertificatePinner.DEFAULT)
```

## 25. 모니터링 & 로깅
Firebase Performance Monitoring 통합:

```kotlin
val trace = Firebase.performance.newTrace("network_call")
trace.start()

// 네트워크 호출 수행
trace.incrementMetric("retry_count", 1)
trace.putAttribute("status_code", response.code.toString())
trace.stop()
```

## 최종 아키텍처 개요
```plaintext
┌───────────────────────┐       ┌───────────────────────┐
│       UI Layer        │       │   Domain Layer        │
│ (Activity/Fragment)   │◄─────►│ (Use Cases/ViewModel) │
└──────────▲────────────┘       └──────────▲────────────┘
           │                                │
           │                                │
┌──────────┴────────────┐       ┌───────────┴────────────┐
│    Data Layer         │       │   Framework Layer      │
│ (Repository/API)      │◄─────►│ (Retrofit/Room/Hilt)   │
└───────────────────────┘       └────────────────────────┘
```

## 실전 적용 팁
- API 버저닝: 모든 요청에 Accept-Version 헤더 추가
- 로컬화: Accept-Language 헤더로 다국어 지원
- 디버깅: Stetho 통합하여 네트워크 트래픽 검사
- 협업: OpenAPI(Swagger) 스펙을 기반으로 API 계약서 작성
- 모의 테스트: MockK를 사용한 유닛 테스트 작성

```kotlin
// MockK 예시
@Test
fun `test network call`() = runTest {
    val mockApi = mockk<ContentApiService>()
    every { mockApi.getContents() } returns Response.success(emptyList())
    
    val viewModel = ContentViewModel(ContentRepository(mockApi))
    viewModel.loadContents()
    
    assert(viewModel.uiState.value is ContentState.Success)
}
```

이제 프로덕션 레벨의 안정적인 네트워크 레이어가 완성되었습니다. 실제 구현 시 팀의 코딩 컨벤션과 프로젝트 요구사항에 맞게 적절히 조정하세요! 🚀