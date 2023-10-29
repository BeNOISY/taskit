FROM openjdk:17-alpine
EXPOSE 8080
ADD target/task-it-be.jar task-it-be.jar
ENTRYPOINT ["java","-jar","/task-it-be.jar"]
