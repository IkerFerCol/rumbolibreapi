FROM azul/zulu-openjdk:17-latest

# Establecer un volumen temporal
VOLUME /tmp

# Copiar el archivo JAR generado al contenedor
COPY build/libs/*.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]