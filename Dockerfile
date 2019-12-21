FROM openjdk:8
EXPOSE 8080
ADD target/spring-devops-docker.jar spring-devops-docker.jar
ENTRYPOINT ["java","-jar","/spring-devops-docker.jar"]
