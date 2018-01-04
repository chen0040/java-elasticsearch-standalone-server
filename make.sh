#!/usr/bin/env bash

mvn -f pom.xml clean package -Plocal -U

cp /target/java-elasticsearch-standalone-server.jar elasticsearch-standalone.jar
