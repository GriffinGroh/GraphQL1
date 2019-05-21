FROM gradle:jdk8 as builder
COPY --chown=gradle:gradle . /app-build
WORKDIR /app-build
RUN gradle bootJar

FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=builder /app-build/build/libs/graphql-customer.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
