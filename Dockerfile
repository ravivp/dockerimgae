FROM tomcat:8.0-jre8
MAINTAINER ravivp
ADD /var/jenkins_home/workspace/build/target/spring-devops-docker.war /usr/local/tomcat/webapps/spring-devops-docker.war
EXPOSE 8081
CMD ["catalina.sh", "run"]
