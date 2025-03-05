# Android 네트워크 통신 구현 가이드

## 1. Gradle 설정
```gradle
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
}
```

## 2. 네트워크 인터페이스 정의
```kotlin
interface NetworkService {
    @POST("content")
    suspend fun postContent(@Body content: Content): Response<Content>

    @GET("content/{id}")
    suspend fun getContent(@Path("id") id: Int): Response<Content>

    @GET("contents")
    suspend fun getContents(): Response<List<Content>>
}
```

## 3. RetrofitClient 구현
```kotlin
object RetrofitClient {
    private const val BASE_URL = "https://your-backend-server.com/api/"

    val api: NetworkService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkService::class.java)
    }
}
```

## 4. 데이터 모델
```kotlin
data class Content(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String
)
```

## 5. Repository 계층
```kotlin
class ContentRepository {
    suspend fun postContent(content: Content): Content =
        withContext(Dispatchers.IO) {
            RetrofitClient.api.postContent(content)
        }

    suspend fun getContent(id: Int): Content =
        withContext(Dispatchers.IO) {
            RetrofitClient.api.getContent(id)
        }

    suspend fun getContents(): List<Content> =
        withContext(Dispatchers.IO) {
            RetrofitClient.api.getContents()
        }
}
```

## 6. Activity 구현
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var contentRepository: ContentRepository
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupListeners()
    }

    private fun setupListeners() {
        binding.apply {
            postButton.setOnClickListener { handlePostContent() }
            loadButton.setOnClickListener { handleLoadContent() }
            loadAllButton.setOnClickListener { handleLoadAllContents() }
        }
    }

    private fun handlePostContent() {
        lifecycleScope.launch {
            try {
                val content = createContentFromInput()
                val result = contentRepository.postContent(content)
                showSuccess("Content posted: ${result.title}")
            } catch (e: Exception) {
                showError(e.message)
            }
        }
    }
}
```

## 7. 레이아웃 구성
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <EditText
        android:id="@+id/titleInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Title" />

    <!-- 추가 입력 필드들 -->

    <Button
        android:id="@+id/postButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Post Content" />

    <!-- 추가 버튼들 -->

</LinearLayout>
```

## 주요 기능
### 컨텐츠 게시
```kotlin
private fun handlePostContent() {
    lifecycleScope.launch {
        try {
            val content = Content(
                id = 0,
                title = binding.titleInput.text.toString(),
                description = binding.descriptionInput.text.toString(),
                imageUrl = binding.imageUrlInput.text.toString()
            )
            val result = contentRepository.postContent(content)
            showSuccess("Content posted successfully")
        } catch (e: Exception) {
            showError("Failed to post content")
        }
    }
}
```

### 컨텐츠 조회
```kotlin
private fun handleLoadContent() {
    lifecycleScope.launch {
        try {
            val contentId = binding.contentIdInput.text.toString().toInt()
            val content = contentRepository.getContent(contentId)
            updateUI(content)
        } catch (e: Exception) {
            showError("Failed to load content")
        }
    }
}
```

## 에러 처리
```kotlin
private fun showError(message: String?) {
    Toast.makeText(this, message ?: "Unknown error", Toast.LENGTH_SHORT).show()
}

private fun showSuccess(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
```

이 구현은 기본적인 네트워크 통신 기능을 제공합니다. 실제 프로젝트에서는 아래 사항들을 추가로 고려해야 합니다:

- 네트워크 상태 확인
- 토큰 기반 인증
- 응답 캐싱
- 에러 처리 고도화
- 백그라운드 작업 처리