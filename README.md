# Final-Project-PM-Service

# :pushpin: PM Service
>프로젝트 매니징 서비스 
>  

</br>

## 1. 제작 기간 & 참여 인원
- 2020년 4월 19일 ~ 7월 7일
- 팀 프로젝트

</br>

## 2. 사용 기술
#### `Back-end`
  - Java 11
  - Spring Boot 2.3
  - Maven
  - Spring Data JPA
  - QueryDSL
  - MariaDB
  - Spring Security
  - 
#### `Front-end`
  - Thymeleaf

</br>

## 3. ERD 설계
![](https://zuminternet.github.io/images/portal/post/2019-04-22-ZUM-Pilot-integer/final_erd.png)


## 4. 핵심 기능
이 서비스의 핵심 기능은 컨텐츠 등록 기능입니다.  
사용자는 단지 컨텐츠의 카테고리를 선택하고, URL만 입력하면 끝입니다.  
이 단순한 기능의 흐름을 보면, 서비스가 어떻게 동작하는지 알 수 있습니다.  

<details>
<summary><b>핵심 기능 설명 펼치기</b></summary>
<div markdown="1">

### 4.1. 전체 흐름


### 4.2. 사용자 요청

### 4.3. Controller



### 4.4. Service



### 4.5. Repository

![](https://zuminternet.github.io/images/portal/post/2019-04-22-ZUM-Pilot-integer/flow_repo.png)

- **컨텐츠 저장** :pushpin: [코드 확인]()
  - URL 유효성 체크와 이미지, 제목 파싱이 끝난 컨텐츠는 DB에 저장합니다.
  - 저장된 컨텐츠는 다시 Repository - Service - Controller를 거쳐 화면단에 송출됩니다.

</div>
</details>

</br>

## 5. 핵심 트러블 슈팅
### 5.1. 컨텐츠 필터와 페이징 처리 문제


## 6. 그 외 트러블 슈팅


## 6. 회고 / 느낀점
>프로젝트 개발 회고 글: 
