FROM amazoncorretto:19-alpine-jdk

MAINTAINER Lauta

COPY target/Portfolio.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
