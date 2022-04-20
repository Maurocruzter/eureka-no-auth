FROM maven:3.8.5-jdk-11 AS build
WORKDIR /app
COPY .  .
RUN mvn install

FROM openjdk:11 AS RUNNER
WORKDIR /app
# The filename is set on pom.xml the tag is <finalName>
COPY --from=build /app/target/JavaApp.jar /app

EXPOSE 8081

CMD ["java", "-jar", "/app/JavaApp.jar"]