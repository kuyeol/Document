# 첫번째 젠킨스 빌드

1. 젠킨스가 구동중이 URL 접속 
2. 초기 비번 위치를 해당 피씨 터미널에서 cat var/경로복붙 출력되는 문자열 입력
3. 새로운 아이템 추가 
4. 아이템 타입은 프리스타일로 (나머지는 //TODO...)

## 아이템 생성

<procedure title="빌드 세팅">

<procedure title="기본 구성">

- 소스 코드 관리
  - Git 체크 후 사용 레포지토리 URL 추가
  - Branches to build 사용중인 브랜치
  - Additional Behaviours 다중 모듈인 경우 메뉴 디렉토리 추가 ___[이미지] 참고___
    - `Add+`  ->  `Check out to a sub-directory` 
  - Triggers 조건으로 빌드
    - `빌드를 원격으로 유발`을 사용해 url 호출 시 빌드 실행
    - 토큰 생성 후 입력 한 뒤 정의 된 URL 접속 시 빌드 실행
    > 접속 URL 예시
    > - http://`JENKINS_URL`/job/spring_server/build?token=`토큰값`

</procedure>

<procedure title="빌드 구성">

- Build Steps
  - `Add build step` -> `Execute shell` ___[이미지]참고___
  - 추가 된 요소에 커맨드를 입력
  - 실제 로컬 커맨드와 같이 쉘_스크립트 사용
  
</procedure>

<procedure title="내용 요약 "> 
  
> 요소 :
>   - 깃 `레포 위치` 추가
>   - `하위 디렉토리` 지정
>   - `트리거` 조건 빌드 구성
>      - URL호출빌드 , 깃 트리거 , 액션....
>   - `빌드 스텝` 실행 명령 구성
>     - 빌드툴스크립트 , 쉘스크립트 등...
  
</procedure> 

</procedure>

<procedure title="이미지">

![image_2.png](image_2.png)
![image_3.png](image_3.png)
</procedure>



## TODO

### APK 자동 빌드 구성 (계속)

Gradle 설정:
Jenkins에 Gradle 설치:
Manage Jenkins → Global Tool Configuration → Gradle 섹션에서 버전 선택 (예: 8.5).
Install automatically 체크 후 저장.
빌드 스텝에서 Gradle 사용:
Add build step → Invoke Gradle script 선택.
Tasks에 clean assembleRelease 입력 (APK 빌드용 명령어).
APK 서명:

Keystore 파일 업로드:
Manage Jenkins → Credentials → System → Global credentials → Add Credentials
Type: Secret file 선택 → keystore 파일 업로드.
build.gradle에 서명 설정 추가:
android {  
signingConfigs {  
release {  
storeFile file(System.getenv("KEYSTORE_PATH"))  
storePassword System.getenv("KEYSTORE_PASSWORD")  
keyAlias System.getenv("KEY_ALIAS")  
keyPassword System.getenv("KEY_PASSWORD")  
}  
}  
buildTypes {  
release {  
signingConfig signingConfigs.release  
}  
}  
}

빌드 스텝에서 환경 변수 주입:
Execute shell 추가 후 아래 명령어 입력:
export KEYSTORE_PATH=${WORKSPACE}/path/to/keystore.jks  
export KEYSTORE_PASSWORD=your_password  
export KEY_ALIAS=your_alias  
export KEY_PASSWORD=your_password

APK 아티팩트 저장:

Post-build Actions → Archive the artifacts 선택.
Files to archive에 **/*.apk 입력 (빌드된 APK 자동 저장).
(2) 깃 커밋/푸시마다 빌드
GitHub 웹훅 설정:

플러그인 설치:
Manage Jenkins → Plugins → Available plugins에서 GitHub Integration 설치.
Jenkins Job 설정:
소스 코드 관리 → Git → Repositories에 GitHub URL 입력.
Branches to build에 */main (기본 브랜치 지정).
Build Triggers → GitHub hook trigger for GITScm polling 체크.
GitHub 레포지토리 설정:
GitHub → 레포지토리 → Settings → Webhooks → Add webhook.
Payload URL: http://<JENKINS_IP>/github-webhook/
Content type: application/json
Trigger: Just the push event 선택.
로컬 네트워크 문제 해결:

Jenkins가 로컬 네트워크에 있는 경우 ngrok을 사용해 외부 접근 허용:
ngrok http 8080  # Jenkins 기본 포트(8080) 터널링

생성된 ngrok URL을 GitHub 웹훅 URL로 사용.
4. 고급 설정 예시
   (1) 빌드 버전 자동화
   Git 커밋 해시로 APK 버전명 설정:
   android {  
   defaultConfig {  
   versionName "1.0.${System.getenv('BUILD_NUMBER')}"  
   }  
   }

Jenkins 환경 변수 BUILD_NUMBER를 빌드 시 자동 주입.
(2) 빌드 실패 알림
Slack 알림 설정:
플러그인 설치: Slack Notification.
Manage Jenkins → Configure System → Slack 섹션에서 웹훅 URL 입력.
Post-build Actions → Slack Notifications 추가 → Notify Every Failure 체크.
5. 최종 검증
   수동 빌드 테스트:
   Jenkins Job → Build Now 클릭 → 콘솔 출력에서 에러 확인.
   자동 빌드 테스트:
   Git 레포지토리에 푸시 → 5초 내 Jenkins 빌드 자동 시작.
   APK 확인:
   빌드 완료 후 Workspace 또는 아티팩트에서 APK 다운로드.
   문제 해결 팁
   빌드 실패 시:
   Console Output에서 로그 확인 → Permission denied 오류는 chmod +x gradlew로 해결.
   웹훅 미동작 시:
   GitHub → Webhooks → Recent Deliveries에서 응답 상태 확인 (200 성공 필수).
   APK 서명 오류:
   keytool -list -v -keystore keystore.jks로 keystore 정보 재확인.




- TODO: 
  - APK 자동 빌드 구성
  - 깃커밋 푸시마다 빌드
