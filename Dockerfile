FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
RUN mvn spring-boot:run -Pprod

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/springBootBlog-0.0.1-SNAPSHOT.jar springBootBlog.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springBootBlog.jar"]