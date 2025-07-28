# filepath: c:\Users\Luminar 25\Documents\quarkus-movie\Dockerfile
FROM eclipse-temurin:17-jre
COPY target/quarkus-movie-1.0.0-SNAPSHOT-runner.jar /application.jar
CMD ["java", "-jar", "/application.jar"]