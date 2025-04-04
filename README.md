# Java_SpringBoot_2025
Java 개발자 과정 SpringBoot

## 1일차

### 웹 개요
- 구성 3단계
    - 브라우저(클라이언트/프론트앤드) : 사용자의 **요청**, 결과를 돌려받는 파트트
    - 서버(벡앤드) : 사용자의 요청을 받아 DB에서 데이터를 가져와 처리하고, 사용자에게 **응답**하는 파트
    - 데이터베이스 : 가장 중요한 데이터가 저장되어 있는 파트

- 웹 개념
    - 사용자 Request(요청)에 대한 Response(응답답)

### SpringBoot 개요
- Java : 컴퓨팅 세상 모든곳에서 사용될 수 있는 언어가 되고자 개발됨
- 웹개발
    1. CGI(Common GataWay Interface) : HTTP 프로토콜에서 정적인 데이터만 전달할 수 있는 웹기술
    2. Servlet : CGI를 개선한 Java 웹기술. 동적으로 개발할 수 있음
        - HTML코드를 전부 JAVA에서 작성성
    3. EJB(Enterprise Java Bean) : 서블릿으로 대형 프로젝트를 개발할 수 있는 Java 웹기술
        - 복잡잡
    4. JSP(Java Server Page) : 웹페이지 코드(HTML)에 자바소스를 포함하여 개발할 수 잇는 JAVA 웹기술
        - 확장자 .jsp / 스파게티 코트
    5. Spring : JAVA 웹개발 전성기
        - 설정이 복잡
    6. Spring Boot : Spring의 단점을 최소화. 설정을 간결과

- Spring Boot
    - Spring의 기술을 그대로 사용(마이그레이션이 간단)
    - JAVA 기술을 사용하면 ERD나 DB설계를 하지 않고도 손쉽게 DB를 생성, DB 연동도 쉬움
    - Tomcat Webserver가 내장(설치 필요없음)
    - 서포터하는 기능 다수 존재(개발을 쉽게 도와줌)
    -  테스트용 JUnit, Log432 모두 포함(설치 필요없음)
    - 프론트엔드를 다양하게 지원, JSP,**Thymeleaf**, Mustache 등
    - React, View, js 등의 자바스크립트 프론트엔드와 연계해서 풀스택 개발 가능
    - MVC(Model View Controller)로 영역을 분리. 각 부분별로 따로 개발발

- MVC
    <img src="image/img01.png" width="700">

### Spring Boot 개발환경 설정
- 필요요소
    - Java, 개발툴, 데이터베이스

- Java
    - Java Runtime과 JDK(Java Developer Kit) 존재
        - Oracle 외에도 OpenJdk가 산재
        - https://adoptium.net/
        - https://www.azul.com/downloads/?package=jdk#zulu
        - https://jdk.java.net/
    - Java 17버전 이상 설치
    - https://www.oracle.com/kr/java/technologies/downloads/
    - jdk-17.0.13_windows-x64_bin.msi 다운로드

    - 시스템 정보(sysdm.cpl) 고급>환경변수 PATH 설정
        - 새로 만들기
            - JAVA_HOME : 본인 경로 입력
        - path에 %JAVA_HOME%\bin 추가, 맨 위로
    - powershell
        - java -version으로 확인

- Visual Studio Code
    - Java 검색
        - Extension Pach for Java 설치.
        - Debuhher for Java 등 총 7가지 확장 설치

### Java 기본 실행
- VS Code에서 명령팔레트 실행(Ctrl + Shift + p)
    1. Java create Java Project > maven
    2. no Archtype
    3. Group ID 입력(com.example > 원하는 이름)
    4. Artifact ID 입력(demo > 변경가능)
    5. 저장위치 결정

### Spring Boot 설정
- Visual Studio Code 확장 설치
    - Spring 검색
        - Spring Boot Extension Pack 설치 -> 모두 설치됨(추가 3개)
    - Gradle(빌트툴) 검색
        - Gradle for Java 설치

### Spring Boot 기본 실행(Java)프로젝트
- VS Code에서 명령 팔레트 실행
    - Spring Initializr : Create a Maven Project
    - Specify Spring Boot version : 3.3.10 선택
    - Specify project langauge : Java
    - Input Group Id: 본인 아이디 입력 / com.yej
    - Input Artifact Id: spring01
    - Specify packaging type: Jar(Java archive, 압축파일)
    - Specify Java version : 17
    - Choose dependencies: Selected 0 dependcies
    - 저장위치 선택
    - **새 창 열기** - Spring Boot 프로젝트가 루트폴더가 된 개발 환경

- 실행방법
    - 코드 작성
    - Spring Boot Dashboard > Apps > 앱 실행

- 기초 문법
    - [JAVA기초문법](./JAVA_BASIC.md)
    - 기본, 변수, 자료형, 연산자, 흐름제어
## 2일차
- 기초문법 계속
    - [JAVA기초문법](./JAVA_BASIC.md)
    - 흐름제어(반복문), 배열, 메서드, 객체/클래스, 상속

## 3일차
- 기초문법 계속
    - [JAVA기초문법](./JAVA_BASIC.md)
    - 상속, 인터페이스, 예외처리, 제네릭, 컬렉션 프레임워크, 입출력

### Spring Boot Build Tool
- 개요
    - 프로젝트 빌드 과정을 자동화시켜주는 도구
    - 컴파일, 테스트, 패키징, 의존성 관리, 배포 등을 포함

- Maven
    1. Java 프로젝트 기본 빌드도구
    2. Maven Repository, https://mvnrepository.com/ 검색 가능능
    3. 빌드, 패키징(jar/war 파일 생성), 테스트 등을 한번의 명령으로 간편하게 처리
    4. 가장 큰 특징이 외부 라이브러리 자동으로 다운로드, 관리s
    5. pom.xml(Project Object Model) 파일로 빌드 설정 관리
        - 초기설정시 빠졌거나, 추가되어야 하면  xml 코딩으로 추가
    6. VSCode 확장 중 Maven Dependency Explorer 등으로 확인

- Gradle
    1. 안드로이드용 오픈소스 빌드도구
    2. Maven Repository를 같이 사용
    3. Maven의 3,4번 특징을 그대로 가지고 있음
    4. build.gradle 파일 사용. Groovy 스크립트 지원
    5. 빌드 과정을 병렬 처리, 캐싱사용으로 Maven보다 10~100배 향상된 성능 구현


### Gradle 설정
- Gradle로 프로젝트가 제대로 동작하지 않으면
    - https://gradle.org/ 에서 gradle 단운로드
    - 설리 경로 확인, 설치
    - 시스템 등록정보 PATH 지정 . gradle_home 사용
 
### Spring Boot 로그 설정
- Spring Boot를 colorizing 해주는 기능
- src/resources/application.properties

    ```shell
    spring.output.ansi.enabled=always
- 서버 재시작

## 4일차
- 기초문법 마무리
    - [Java 기초 문법](./JAVA_BASIC.md)
    - 제네릭, 컬렉션 프레임워크, 입출력, 람다식, 스트림API

- Spring Boot 시작
- Gradle 오류 해결법

## 5일차





## 6일차
