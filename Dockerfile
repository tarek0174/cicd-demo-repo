# Use the official OpenJDK 11 image as the base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

EXPOSE 8080

# Copy the application JAR file to the working directory
COPY target/sonarqube-demo-0.0.1-SNAPSHOT.jar .

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "sonarqube-demo-0.0.1-SNAPSHOT.jar"]
