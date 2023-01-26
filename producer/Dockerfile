FROM eclipse-temurin:17.0.6_10-jdk-alpine AS build-env
WORKDIR /app
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw package -Dmaven.test.skip=true -Dspring-boot.repackage.skip=true
COPY . .
RUN ./mvnw package -Dmaven.test.skip=true

FROM gcr.io/distroless/java17-debian11
WORKDIR /app
COPY --from=build-env /app/target/producer.jar /app
CMD ["producer.jar"]