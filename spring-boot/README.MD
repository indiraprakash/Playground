## Spring boot
Spring Boot makes it effortless to create Spring-powered, production-ready services
without a lot of code.

- Spring Boot is not an application server.But it’s the embedded servlet container that provides application server functionality.

##### Tools
- Web interface https://start.spring.io
- Spring Tool Suite
- Spring Boot CLI

##### Spring Boot Annotations
- `@Configuration` Designates a class as a configuration class
- `@RestController` A convenience annotation that is itself annotated with `@Controller` and `@ResponseBody`
- `@RequestMapping` Annotation for mapping web requests onto methods in request-handling classes
- `@Entity` declares the class as an entity (i.e. a persistent PlainOldJavaObject(POJO) class), `@Id` declares the identifier property of this entity.
- `@GeneratedValue` to indicate that this field is the entity’s identity and that its value will be automatically provided.
```java
@Entity
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
}

```
