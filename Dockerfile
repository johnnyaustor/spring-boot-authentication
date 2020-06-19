FROM adoptopenjdk/openjdk8:x86_64-alpine-jre8u-nightly
EXPOSE 8080
ADD target/jwt-auth-0.0.1-SNAPSHOT.jar jwt-auth-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "jwt-auth-0.0.1-SNAPSHOT.jar"]
