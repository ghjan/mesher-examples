FROM openjdk:8-jre-alpine

WORKDIR /home/apps/

ADD start.sh .

ADD target/springmvcprovider-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["sh", "-x", "/home/apps/start.sh"]