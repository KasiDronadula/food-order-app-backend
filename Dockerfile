# Use official Java image
FROM openjdk:17-jdk-slim

# Set workdir
WORKDIR /app

# Copy built jar from target folder (for Maven)
COPY target/*.jar app.jar

# Expose port
EXPOSE 5454

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
