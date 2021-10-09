FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


# # Use official base image of Java Runtim
# FROM openjdk:11
#
# # Set volume point to /tmp
# VOLUME /tmp
#
# # Make port 8080 available to the world outside container
# EXPOSE 8080
#
# # Set application's JAR file
# ARG JAR_FILE=target/*.jar
#
# # Add the application's JAR file to the container
# ADD ${JAR_FILE} app.jar
#
# # Run the JAR file
# ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
#
# # setting marven and path
# # docker build -t hapana-spring-api .
# # docker run -p 9000:8080 hapana-spring-api