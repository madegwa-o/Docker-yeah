FROM openjdk:17-jdk

WORKDIR /app

COPY target/first-0.0.1-SNAPSHOT.jar /app/first.jar

EXPOSE 8080

CMD ["java", "-jar", "first.jar"]