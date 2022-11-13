FROM maven:latest AS MAVEN_BUILD
COPY ./ ./
RUN mvn clean package

FROM openjdk:latest
COPY --from=MAVEN_BUILD ./target/vrnova-courses-backend-1.0.jar vrnova-courses-backend-1.0.jar
CMD ["java","-jar","vrnova-courses-backend-1.0.jar"]
