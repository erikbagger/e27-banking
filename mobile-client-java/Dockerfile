FROM gradle:jdk11
MAINTAINER lordbagger
COPY ./build/libs/mobile-client-java*.jar /home/workspace/java/
WORKDIR /home/workspace/java/
ENTRYPOINT java -jar mobile-client-java-*.jar
EXPOSE 8080