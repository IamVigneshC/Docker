# Build a JAR File
FROM maven:3.6.3-jdk-8-slim AS stage1
WORKDIR /Docker/Projects/myFirstJava/
COPY . /Docker/Projects/myFirstJava/
RUN mvn -f /Docker/Projects/myFirstJava/pom.xml clean package

# Create an Image
FROM openjdk:8-jdk-alpine
EXPOSE 5000
COPY --from=stage1 /Docker/Projects/myFirstJava/myfirstjava.jar myfirstjava.jar
ENTRYPOINT ["sh", "-c", "java -jar /myfirstjava.jar"]
