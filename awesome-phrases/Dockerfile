FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY ./target/awesome-phrases-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]