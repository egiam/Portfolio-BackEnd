FROM amazoncorretto:11-alpine-jdk
MAINTAINER GEM
COPY gem/target/gem-0.0.1-SNAPSHOT.jar gem-app.jar
ENTRYPOINT ["java", "-jar", "/gem-app.jar"]
