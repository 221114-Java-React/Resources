# How To Start A Spring Project

---

## Maven Dependency

```xml

<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.7.4</version>
</parent>

<dependencies>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
</dependencies>
```

## Application YAML Configuration

```yaml
# Where the application is hosted on.
server:
  port: 8080
  servlet:
    context-path: /your-application-path

spring:
  application:
    name: your-application-name
  datasource:
    driver-class-name: org.postgresql.Driver
    url: your-db-url
    username: your-db-username
    password: your-db-password
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQL10Dialect
    show-sql: true
    hibernate:
      # hibernate will drop and create your tables whenever you start your application.
      ddl-auto: create-drop
```

## Spring AOP

### Main Driver Class

```java

@SpringBootApplication // will scan your project for annotations
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); // essentially run this project as a spring boot application
    }
}
```

### Controllers

```java

@RestController // specify that this class is a rest controller
@RequestMapping("/auth") // this controller is mapped to path /auth
public class AuthController {
    // the controller handles all the endpoint requests
}
```

### Services

```java

@Service // to indicate that they're holding the business logic
public class UserService {
    
}
```

### Repositories

```java

@Repository // to catch persistence-specific exceptions and re-throw them as one of Spring’s unified unchecked exceptions.
public interface UserRepository extends CrudRepository<User, String> {
    
}
```

### Entities


```java

@Entity
@Table("users")
public class User {
    @Id
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
}
```

### Components

```java

@Component // to mark the beans as Spring's managed components
public class JwtConfig {
    
}
```