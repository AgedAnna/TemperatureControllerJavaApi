FROM openjdk:17-jdk

WORKDIR /app

COPY target/demo.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
