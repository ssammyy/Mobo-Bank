#Specify the base image that my docker file will use to build the image
FROM openjdk:17

#Copy the files needed in the container in my case only the build  jar file
ADD target/MoboBankApi-0.0.1-SNAPSHOT.jar MoboBankApi-0.0.1-SNAPSHOT.jar
#Exposing the port where docker runs on the host machine
EXPOSE 8121
#The system to run the application in the container
ENTRYPOINT ["java", "-jar", "MoboBankApi-0.0.1-SNAPSHOT.jar"]