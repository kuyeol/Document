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

> 저장 후 구동 확인 
> 내용 요약
> 요소 
> - 깃 `레포 위치` 추가
> - `하위 디렉토리` 지정
> - `트리거` 조건 빌드 구성
>   - URL호출빌드 , 깃 트리거 , 액션....
> - `빌드 스텝` 실행 명령 구성
>   - 빌드툴스크립트 , 쉘스크립트 등...


</procedure>



<procedure title="이미지">

![image_2.png](image_2.png)
![image_3.png](image_3.png)
</procedure>

- TODO: 
  - APK 자동 빌드 구성
  - 깃커밋 푸시마다 빌드
