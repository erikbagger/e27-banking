FROM gradle:jdk11
MAINTAINER lordbagger
COPY ./build/libs/e27-banking-server*.jar /home/workspace/java/
WORKDIR /home/workspace/java/
ENTRYPOINT java -jar e27-banking-server-*.jar
EXPOSE 8080