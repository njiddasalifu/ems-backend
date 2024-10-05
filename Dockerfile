# Use a base image with Java installed
FROM openjdk:17-jdk-alpine
  
  # Set the working directory inside the container
WORKDIR /app
  
  # Copy the JAR file into the container
COPY target/ems-backend-0.0.1-SNAPSHOT.jar /app/ems-backend.jar
  
  # Specify the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/ems-backend.jar"]
