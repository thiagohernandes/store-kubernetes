FROM openjdk:11

RUN mkdir /opt/store-orders

ENV DEPLOYMENT_JAR /opt/store-orders

COPY target/store-orders.jar $DEPLOYMENT_JAR

ENTRYPOINT exec java -jar $DEPLOYMENT_JAR/store-orders.jar
