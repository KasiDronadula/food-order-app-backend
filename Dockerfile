# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set a working directory
WORKDIR /app

# Copy the built jar from the target folder to the image
COPY target/zosh-food-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 5454

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
