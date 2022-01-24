FROM openjdk:11

RUN mkdir /opt/store-products

ENV DEPLOYMENT_JAR /opt/store-products

COPY target/store-products.jar $DEPLOYMENT_JAR

ENTRYPOINT exec java -jar $DEPLOYMENT_JAR/store-products.jar
