FROM amazoncorretto:11-alpine-jdk
MAINTAINER baeldung.com
COPY bago.jar bago1.jar
ENTRYPOINT ["java","-jar","bago1.jar"]
