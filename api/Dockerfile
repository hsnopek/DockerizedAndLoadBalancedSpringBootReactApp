# syntax=docker/dockerfile:experimental                      
FROM openjdk:11-slim-buster as build

COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
COPY src src

RUN --mount=type=cache,target=/root/.m2,rw ./mvnw -B package 

FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=target/*.jar
COPY --from=build ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar