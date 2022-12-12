# Spring Application YML Configuration

---

```yaml
# Where the application is hosted on.
server:
  port: 8080
  servlet:
    context-path: /invincible
    
spring:
  application:
    name: <application_name>
  datasource:
    driver-class-name: org.postgresql.Driver
    url: <url>
    username: <username>
    password: <password>
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQL10Dialect
    show-sql: true
    hibernate:
      ddl-auto: update
```