FROM quay.io/quarkus/quarkus-micro-image:3.24.5-java17
WORKDIR /work/
COPY target/quarkus-movie-*-runner.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "--add-opens=java.base/java.lang=ALL-UNNAMED", "-Dquarkus.http.host=0.0.0.0", "-jar", "app.jar"]
