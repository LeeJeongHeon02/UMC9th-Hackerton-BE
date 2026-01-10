# 덤앤덤 Backend API
합리적인 소비를 위한 위치 기반 가성비 추천 서비스 백엔드 API

## **🚀 기술 스택**

- **Framework**: Spring Boot 3.4.1
- **Language**: Java 17
- **Database**: MySQL
- **ORM**: Spring Data JPA / Hibernate
- **API Documentation**: Swagger (OpenAPI 3.0)
- **AI**: Google Gemini API
- **CI/CD**: AWS EC2, Github Actions

## **🤝 팀 컨벤션**

| **Category** | **Link** |
| --- | --- |
| **브랜치 전략** |   Git flow 방식 |
| **코드 스타일** | [Code Style 가이드](https://www.notion.so/2539715a4be680babbdde21692446613?pvs=21) |
| **PR 규칙** | [Issue / PR / Commit 규칙](https://www.notion.so/2539715a4be68074bd71e123523cd16c?pvs=21) |

## **📋 주요 기능**

### **1. 온보딩 (설문조사)**

- 카테고리 선택 (카페/식당)
- 예산 범위 설정 (최소/최대)
- 검색 반경 설정 (300m, 500m, 1km, 1.5km)
- 위치 정보 설정 (위도/경도)

### **2. 장소 검색**

- 위치 기반 주변 장소 검색
- 카테고리 및 예산 필터링
- 거리 순 정렬

### **3. AI 스마트 경로 추천 (Gemini API)**

- 출발지-도착지 경로 기반 장소 추천
- 직선 경로를 300m 간격으로 분할하여 검색
- 각 기준점에서 500m 반경 내 장소 검색
- 경로 이탈 거리와 가격 가중치 점수 계산 (60:40)
- 자연어 프롬프트 분석 (카페/식당 자동 인식)

🗂️ 프로젝트 도메인 구조
```
umc9th-BE/
├── src/main/java/com/umc9th/dumMoney/
│   ├── DumApplication.java          # 메인 애플리케이션
│   ├── domain/
│   │   ├── member/                  # 멤버 도메인
│   │   │   ├── controller/          # OnboardingController, MemberController
│   │   │   ├── service/             # MemberService
│   │   │   ├── repository/          # MemberRepository
│   │   │   ├── entity/              # Member
│   │   │   ├── dto/                 # OnboardingRequest, PreferenceResponse 등
│   │   │   └── enums/               # Category (CAFE, RESTAURANT)
│   │   └── place/                   # 장소 도메인
│   │       ├── controller/          # PlaceController
│   │       ├── service/             # PlaceService, GeminiService
│   │       ├── repository/          # PlaceRepository
│   │       ├── entity/              # Place, PlaceCategory
│   │       └── dto/                 # RecommendationRequestDto, PlaceDetailResponseDto 등
│   └── global/                      # 공통 설정
│       ├── apiPayload/              # ApiResponse, ErrorCode 등
│       ├── common/                  # BaseEntity
│       └── config/                  # WebConfig, SwaggerConfig
└── src/main/resources/
    └── application.yml              # 설정 파일
```
