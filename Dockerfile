FROM amazoncorretto:17-alpine-jdk
COPY target/dpd-backend-0.0.1-SNAPSHOT.jar dpd-backend-0.0.1.jar
ENTRYPOINT ["java","-jar","/dpd-backend-0.0.1.jar"]