# 안드로이드 네트워크 요청/응답 처리

네트워크 데이터 요청 응답을 위한 코드를 생성하고 구현하는 것은 안드로이드 앱 개발에서 중요한 부분입니다.

## 1. 설정
### Gradle 설정
```gradle
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
}
```

## 2. Retrofit 구현
### NetworkService.kt
```kotlin
interface NetworkService {
    @POST("content")
    suspend fun postContent(@Body content: Content): Response<Content>

    @GET("content/{id}")
    suspend fun getContent(@Path("id") id: Int): Response<Content>
}
```

### RetrofitClient.kt
```kotlin
object RetrofitClient {
    private const val BASE_URL = "https://your-backend-server.com/api/"
    
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: NetworkService = retrofit.create(NetworkService::class.java)
}
```

## 3. 데이터 모델
```kotlin
data class Content(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String
)
```

## 4. Repository 패턴
```kotlin
class ContentRepository {
    suspend fun postContent(content: Content): Content {
        return withContext(Dispatchers.IO) {
            RetrofitClient.api.postContent(content)
        }
    }

    suspend fun getContent(id: Int): Content {
        return withContext(Dispatchers.IO) {
            RetrofitClient.api.getContent(id)
        }
    }
}
```

## 5. UI 구현
### MainActivity.kt
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var contentRepository: ContentRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        // View 초기화
    }
}
```

### 레이아웃
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout 
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <!-- UI 컴포넌트들 -->

</LinearLayout>
```

## 주요 기능 설명
- 컨텐츠 게시: POST 요청으로 새로운 컨텐츠 생성
- 컨텐츠 조회: GET 요청으로 특정 컨텐츠 로드
- 에러 처리: 네트워크 오류 및 예외 상황 대응
- 상태 관리: 로딩, 성공, 실패 상태 처리

## 코드 적용 예시
```kotlin
// 컨텐츠 생성
lifecycleScope.launch {
    try {
        val content = Content(0, "제목", "내용", "이미지URL")
        val result = contentRepository.postContent(content)
        showSuccess("컨텐츠가 생성되었습니다")
    } catch (e: Exception) {
        showError(e.message ?: "알 수 없는 오류")
    }
}

// 컨텐츠 로드
lifecycleScope.launch {
    try {
        val content = contentRepository.getContent(1)
        updateUI(content)
    } catch (e: Exception) {
        showError("컨텐츠 로드 실패")
    }
}
```

이 구현을 기반으로 필요한 기능을 추가하고 확장할 수 있습니다. 실제 프로젝트에서는 보안, 성능, 사용자 경험을 고려한 추가 구현이 필요합니다.