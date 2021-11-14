FROM maven:3.6.3-jdk-11-slim
WORKDIR /app
COPY . .
RUN mvn package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=0 /app/target/spring-rest-example-0.0.1-SNAPSHOT.jar spring-rest-example.jar
ENTRYPOINT ["java","-jar","/app/spring-rest-example.jar"]


