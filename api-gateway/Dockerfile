FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY ./target/api-gateway-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]