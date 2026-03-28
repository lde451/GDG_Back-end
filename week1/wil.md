### 웹
인터넷은 전 세계 컴퓨터를 연결하는 거대한 네트워크다. 웹은 그 인터넷 위에서 동작하는 서비스 중 하나다. 웹은 클라이언트-서버 모델로 동작하는데, 클라이언트가 요청을 보내면 서버가 처리한 후 응답을 반환하는 구조. URL은 자원의 위치를 나타냄.

**>> URL 구성요소**
- Scheme(Protocol): 통신 규칙 (예: http)
- Host: 서버의 IP 주소 또는 도메인
- Port: 네트워크 포트 번호
- Path: 서버 내 자원의 경로
- Query: `?` 뒤에 key-value 형식으로 추가 정보 전달

### HTTP
HyperText Transfer Protocol. 웹에서 클라이언트와 서버가 데이터를 주고받기 위한 프로토콜

**>> 특성**
- 무상태성(Stateless): 서버는 이전 요청을 기억하지 않고 매번 요청을 독립적으로 처리함
- 비연결성(Connectionless): 응답 후 서버와의 연결 유지X

**>> HTTP 요청 구조**
- start line: 요청 메서드, 경로, HTTP 버전
- headers: 요청에 대한 부가 정보
- body: 실제 전송할 데이터

**>> HTTP 응답 구조**
- status line: HTTP 버전, 상태 코드, 상태 메시지
- headers: 응답에 대한 부가 정보
- body: 실제 응답 데이터

**>> 주요 HTTP 메서드**
- GET : 리소스 조회
- POST : 리소스 추가, 등록
- PUT : 리소스 교체, 없으면 새로 생성
- PATCH : 리소스의 일부 수정
- DELETE : 리소스 삭제

**>> 주요 HTTP 상태 코드**
- 200 (OK) : 요청이 성공적으로 처리됨
- 201 (Created) : 요청이 성공적으로 처리되어 새로운 리소스가 생성됨
- 400 (Bad Request) : 클라이언트의 요청이 잘못되어 서버가 이해하지 못함
- 404 (Not Found) : 지정한 리소스를 찾을 수 없음
- 500 (Internal Server Error) : 서버 내부 오류로 요청을 처리할 수 없음

### 프론트엔드와 백엔드
- 프론트엔드 : 사용자가 직접 보고 상호작용하는 화면(UI)을 개발
- 백엔드 : 사용자의 요청을 받아 실제 동작을 처리하고 데이터를 저장 및 관리

서버가 다루는 방대한 데이터는 DB에 영구적이고 안전하게 보관되고, DBMS로 관리된다.

대표적인 DBMS : MySQL, PostgreSQL, MongoDB

### API와 REST API
API란 한 프로그램이 다른 프로그램의 기능이나 데이터를 사용할 수 있도록 미리 정해놓은 규칙이자 소통 창구

REST는 HTTP의 장점을 최대한 활용하는 네트워크 아키텍처 스타일로, 세 가지 구성 요소로 이루어짐

- 자원(Resource) : 고유한 URI로 식별 => `/members/1`
- 행위(Verb) : HTTP 메서드로 표현 => GET, POST, PATCH, DELETE
- 표현(Representation) : 데이터 교환 형식 => JSON

REST API는 이 REST 원칙을 준수해 만든 API로, HTTP의 모범 사례임.

### Spring Boot
- Spring : Java 기반 오픈소스 애플리케이션 프레임워크. 객체지향의 장점을 살려 백엔드 애플리케이션을 빠르고 안정적으로 만들 수 있도록 기본 구조와 규칙을 제공한다.
- Spring Boot : 복잡한 초기 설정 없이 Spring 프레임워크를 빠르고 쉽게 사용할 수 있게 해주는 도구.

---

## Whitelabel Error Page 스크린샷
![Whitelabel Error Page](./whitelabel.png)

---

## 온라인 쇼핑몰 프로젝트 API 명세서
### 상품 기능 (기능 - HTTP method - URI)
- 상품 정보 등록 - POST - `/products`
- 상품 목록 조회 - GET - `/products`
- 개별 상품 정보 상세 조회 - GET - `/products/{productId}`
- 상품 정보 수정 - PATCH - `/products/{productId}`
- 상품 삭제 - DELETE - `/products/{productId}`

### 주문 기능
- 주문 정보 생성 - POST - `/orders`
- 주문 목록 조회 - GET - `/orders`
- 개별 주문 정보 상세 조회 - GET - `/orders/{orderId}`
- 주문 취소 - DELETE - `/orders/{orderId}`