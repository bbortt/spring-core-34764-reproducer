The following command provokes the error described in https://github.com/spring-projects/spring-framework/issues/34764:

```shell
./mvnw verify
```

To see it passing with `spring-core@6.2.4`, change the version of `org.springframework:spring-core` in [`main-class/pom.xml`](main-class/pom.xml).
