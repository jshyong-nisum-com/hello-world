#!/bin/bash
# =========================
# Build script for HelloWorld App
# =========================

echo "Starting building Jimmy hello-world..."
cd /Users/NIS1643-mbpr/data/my-workspace/hello-world
javac -d bin src/main/java/HelloWorld.java
java -cp target/classes HelloWorld
echo "Done building Jimmy hello-world!"

