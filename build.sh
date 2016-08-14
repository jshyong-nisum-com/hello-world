#!/bin/bash
# =========================
# Build script for HelloWorld App
# =========================

pwd=`pwd`
echo "Starting building Jimmy hello-world..."
echo "Current working dir: $pwd"
# cd /Users/NIS1643-mbpr/data/my-workspace/hello-world
javac -d build/classes src/main/java/test/jenkins/hello/HelloWorld.java
java -cp build/classes test.jenkins.hello.HelloWorld
echo "Done building Jimmy hello-world!"

