FROM openjdk:8
VOLUME /tmp
ADD target/spring-boot-docker-withmaven*.jar spring-boot-docker-withmaven.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "spring-boot-docker-withmaven.jar"]
