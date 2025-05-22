# Mcp-server

## 프로젝트 개요

**Mcp-server**는 다양한 클라우드, 컨테이너, 데이터 저장소 환경과 연동되는 모듈형 백엔드 서버 프로젝트입니다.  
주요 목적은 **도커(Docker) 컨테이너 관리**, **파일 스토리지**, **카프카 기반 메시지 처리**, **Vault 기반 시크릿 관리** 등 DevOps/클라우드 자동화를 위한 통합 서버를 구현하는 것입니다.

---

## 주요 기능

- **Docker Agent**  
  - REST API를 통해 도커 컨테이너 생성/실행/빌드/터미널 명령 처리
  - 이미지 빌드, 볼륨 마운트, 포트 바인딩 등 지원  
- **Agent Embedd**  
  - 문서 전처리/임베딩(PDF, HTML 등)
  - Quarkus 기반의 경량 자바 백엔드  
- **Kafka 연동**  
  - Kafka 프로듀서/컨슈머, 메시지 브로커 연동
- **MinIO, Vault, Redis 등 연동**  
  - MinIO 스토리지, Vault 시크릿 관리, Redis 캐시 및 시크릿 스토리지 모듈화  
- **프론트엔드, 실험/테스트 코드, 다양한 유틸리티 포함**

---

## 기술 스택

- **백엔드:** Java, Quarkus, Spring (일부)
- **컨테이너:** Docker, docker-java
- **메시징:** Kafka
- **스토리지:** MinIO, Redis, HashiCorp Vault
- **프론트:** HTML, JavaScript, CSS
- **기타:** Python, 기타 테스트/실험 코드 포함

---

## 폴더 구조 (일부)
- `agent-embedd/` : 문서 임베딩/전처리 모듈
- `docker-agent/` : 도커 컨테이너 관리 API
- `minio-storage/` : MinIO 연동 모듈
- `redis-secret/`, `redis-vault-secret/` : 시크릿 관리 및 캐시
- `storage-server/`, `front-server/` : 백엔드/프론트엔드 서버
- `praciceNtest/`, `pdf-xlxs/` : 실험/테스트, 문서 변환 등
- `gemini-workshop-for-java-developers-main/` : Gemini 기반 실습 코드
- 기타 `.github/`, `.idea/` 등 설정 폴더

> [더 많은 파일/폴더 보기](https://github.com/kuyeol/Mcp-server/tree/main)

---

## 빌드 및 실행

- **Quarkus 기반 모듈**
  ```bash
  ./mvnw quarkus:dev
  ```
- **Docker 기반 연동**
  - see: `docker-agent/README.md` 참고
- **Kafka, Vault, MinIO 등**
  - 각 서브모듈별 README, md 파일 참고

---

## 참고/문서

- `25-05-16agent_note.md` : Agent 개발 노트
- `Ai커맨드설계.md` : AI 커맨드 설계 문서
- `docker_Tcp_connect.md`, `vault.md`, `미나이오클라이언트명령어.md` 등 환경별 사용법
- 각 디렉토리별 `README.md` 및 메인 코드 참고

---

## 기여 및 라이선스

- 개인 연구/개발 및 DevOps 자동화 실험 목적
- 별도 라이선스 미포함(내부 활용)

---

## 관련 링크

- [Quarkus 공식 홈페이지](https://quarkus.io/)
- [docker-java](https://github.com/docker-java/docker-java)
- [Kafka](https://kafka.apache.org/)
- [HashiCorp Vault](https://www.vaultproject.io/)
- [MinIO](https://min.io/)

---

## Contact

- Author: kuyeol
- GitHub: [https://github.com/kuyeol](https://github.com/kuyeol)
