FROM amazoncoretto:8-alpine-jdk

COPY target/Portfolio.jar Portfolio.jar

ENTRYPOINT ["java","-jar","/Portfolio.jar"]
