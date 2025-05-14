FROM gradle:8.5.0-jdk23 AS build
COPY . .
WORKDIR /app
RUN gradle build -x test

FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]