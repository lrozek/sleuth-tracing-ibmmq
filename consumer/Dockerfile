FROM eclipse-temurin:17.0.6_10-jdk-alpine AS build-env
WORKDIR /app
COPY . . 
RUN ./mvnw clean package

FROM gcr.io/distroless/java17-debian11
WORKDIR /app
COPY --from=build-env /app/target/consumer.jar /app
CMD ["consumer.jar"]