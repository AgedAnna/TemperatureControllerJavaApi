FROM openjdk:17-jdk

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar.original app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
