# Этап 1 - сборка проекта в jar
FROM maven:3.6.3-openjdk-17 as maven
RUN mkdir job4j_di
WORKDIR job4j_di
COPY . .
RUN mvn package -Dmaven.test.skip=true
CMD ["mvn", "liquibase:update", "-Pdocker"]

# Этап 2 - указание как запустить проект
FROM openjdk:17.0.2-jdk
WORKDIR job4j_di
COPY --from=maven /target/main.jar app.jar
CMD java -jar app.jar