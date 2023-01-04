FROM openjdk:8-jdk-alpine
LABEL maintainer="author@javatodev.com"
VOLUME /main-app
ADD target/MyApp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["mysql_db:3306", "--","java", "-jar","/app.jar"]

