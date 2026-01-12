FROM openjdk:21-jdk-alpine
WORKDIR /app
COPY target/student-service-0.0.1-SNAPSHOT.jar student-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "student-service.jar"]