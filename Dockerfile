# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 as builder

WORKDIR /app

# Copy source code
COPY . .

# Package the application
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar from the previous stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
