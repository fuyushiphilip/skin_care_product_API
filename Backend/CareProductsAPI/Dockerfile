##
## Build stage
##
#FROM maven:3.8.2-jdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests
#
##
## Package stage
##
#FROM openjdk:17-jdk-slim
#COPY --from=build /target/CareProductsAPI-0.0.1-SNAPSHOT.jar
##COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
## ENV PORT=8080
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","CareProductsAPI.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar CareProductsAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CareProductsAPI-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080