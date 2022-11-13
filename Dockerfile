FROM maven:latest AS MAVEN_BUILD
COPY ./ ./
RUN mvn clean package
FROM openjdk:latest
COPY --from=MAVEN_BUILD ./target/app-1.0.1.RELEASE.jar app-1.0.1.RELEASE.jar
ENTRYPOINT ["java","-jar","app-1.0.1.RELEASE.jar"]