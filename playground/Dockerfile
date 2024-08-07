FROM gradle:8-jdk21 AS builder
WORKDIR /app

COPY . .

RUN gradle bootJar

FROM amazoncorretto:21 AS runner
COPY --from=builder /app/build/libs/api.jar api.jar

EXPOSE 8080

CMD java -jar api.jar
