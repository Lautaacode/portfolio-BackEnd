FROM amazoncoretto:19

COPY target/Portfolio.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
