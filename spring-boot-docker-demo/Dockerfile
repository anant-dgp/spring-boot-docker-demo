FROM openjdk:8-jdk-alpine
MAINTAINER vaxa.in
EXPOSE 8080
COPY target/spring-boot-docker-demo-0.0.1-SNAPSHOT.jar my-app.jar
ENTRYPOINT ["java","-jar","/my-app.jar"]