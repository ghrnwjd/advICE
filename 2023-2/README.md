# Week 1

## 스프링 부트 프로젝트 폴더 구조

https://studygyaan.com/spring-boot/spring-boot-project-folder-structure-and-best-practices

==기본 src 구조==
```
/my_spring_boot_project/
|-- src/
    |-- main/
    |   |-- java/
    |   |   |-- com/
    |   |   |   |-- yourdomain/
    |   |   |   |   |-- controller/
    |   |   |   |   |-- model/
    |   |   |   |   |-- service/
    |   |   |   |   |-- repository/
    |   |   |-- resources/
    |   |   |   |-- static/
    |   |   |   |-- templates/
    |   |   |   |-- application.properties
    |-- test/
```

==모듈별 정리==
```
/my_spring_boot_project/
|-- src/
    |-- main/
    |   |-- java/
    |   |   |-- com/
    |   |   |   |-- yourdomain/
    |   |   |   |   |-- module1/
    |   |   |   |   |   |-- controller/
    |   |   |   |   |   |-- model/
    |   |   |   |   |   |-- service/
    |   |   |   |   |   |-- repository/
    |   |   |   |   |-- module2/
    |   |   |   |   |   |-- controller/
    |   |   |   |   |   |-- model/
    |   |   |   |   |   |-- service/
    |   |   |   |   |   |-- repository/
    |-- test/
```

#### Controller, Model, Service, Repository
- `main/`: 우리가 만들 앱의 메인 코드와 자원들을 가지고 있는 디렉토리
- `java/`: 자바 소스 코드의 루트 패키지
- `com/`: 흔한 기업을 위한 패키지이름이며, 이름 충돌을 방지하기 위함이다.
- `yourdomain/`: 조직의 이름
- `controller/`: HTTP 요청을 처리하기 위한 Spring MVC Controllers
- `model/`: 앱의 엔티티나 데이터를 다루는 곳(DTO 등)
- `service/`: 비즈니스 로직을 구현, 실현하는한다. 로직은 컨트롤러와 레파지토리 사이에서 주로 실행된다.
- `repository/`: 데이터 접근을 다루고 DB와의 인터렉션을 한다.
- `resources/`: 구성파일이나 자원들을 관리하는 폴더
- `static/`: 프로젝트 전역의 정적 파일을 보관하는 곳
- `templates/`: 프로젝트 전역의 템플릿들을 보관하는 곳
- `application.properties`: 프로젝트 구성을 관리하는 곳

![Springboot Request-Response Process](https://miro.medium.com/v2/resize:fit:990/0*nTfiZCLU6Zga9ESH.png)

간단한 예제 (로그인)
1. 사용자(클라이언트)는 username, password를 입력하고 로그인 버튼을 누른다.
2. 로그인 버튼은 POST 방식 통신을 하며, Spring Controller에 매핑되어 있는 주소를 찾는다.
	1. 로그인 버튼: .post("localhost:8080/login")
	2. Controller 메서드 : @PostMapping("/login")
3. 해당 컨트롤러는 그에 맞는 서비스를 실행한다.
```java
// UserController.java

@PostMapping("/login")
public void 로그인(String username, String password) {
	userService.login(username, password);
}
```

4. 해당 서비스는 이미 등록된 유저인지 확인한다.
```java
// UserService.java

@Autowired
private UserRepository userRepository; // DB 관련

public void login(String username, String password) {
	// 이미 해당 유저가 존재하는지 확인
	User user = userRepository.findByUsername(username);
	// 유저가 존재하지 않는다면 새로운 유저를 저장한다.
	if(user != null) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userRepository.save(user)
	}
	else { 
	// 유저가 존재한다면 이미 존재하는 회원임을 알린다.
		System.out.println("이미 존재하는 회원입니다.")
	}	
}
```

5. Service에서 리턴한 내용이 컨트롤러에게 리턴되며, 다시 컨트롤러는 사용자 클라이언트에게 해당 내용을 리턴한다.





### ==Before Start==

```yml
server:  
  port: 8000  
  servlet:  
    context-path: /  
    encoding:  
      charset: UTF-8  
      enabled: true  
      force: true  
  
spring:  
  mvc:  
    view:  
      prefix:  
      suffix:  
  
  datasource:  
    driver-class-name: com.mysql.cj.jdbc.Driver  
    url: jdbc:mysql://localhost:3306/DB명?serverTimezone=Asia/Seoul 
    username:  
    password:  
  
  jpa:  
    open-in-view: true  
    hibernate:  
      ddl-auto: create  
      naming:  
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl  
  
    show-sql: false # sql?? ???? ????.  
    properties:  
      hibernate.format_sql: true # ???? ???? ?????.  
  
  jackson:  
    serialization:  
      fail-on-empty-beans: false
```


```SQL
CREATE USER ghrnwjd identified BY "1234";
GRANT ALL privileges ON *.* TO 'ghrnwjd'@'%';
```