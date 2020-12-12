#!/bin/sh

#export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home
export JAVA_HOME=/Users/liruizhao/.sdkman/candidates/java/20.3.0.r11-grl/
export PATH=${PATH}:${JAVA_HOME}/bin

mvn -DskipTests=true -Pnative clean package
