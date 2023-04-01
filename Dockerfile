FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /app
COPY build/libs/*.jar /app/spring-boot-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]