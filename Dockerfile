# Etapa 1: Construcción con Gradle
FROM gradle:8.5.0-jdk24 AS builder
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon

# Etapa 2: Imagen final usando OpenJDK
FROM openjdk:17-jdk
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]