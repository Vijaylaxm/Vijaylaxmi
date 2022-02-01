FROM openjdk:8
ADD target/docker3-0.0.1-SNAPSHOT.jar docker3-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker3-0.0.1-SNAPSHOT.jar"]