# https://hub.docker.com/_/maven
FROM maven:3.9.0-amazoncorretto-8
ADD . /gettingStarted
WORKDIR /gettingStarted
CMD mvn jetty:run