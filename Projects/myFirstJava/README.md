# Simple Java App using Docker

## Registry/Repository: 
https://hub.docker.com/repository/docker/iamvignesh/myfirstjava

## Build, Tag, Push Image:
```sh
docker build -t iamvignesh/myfirstjava:v1.0 .

docker images
docker tag 76d03cf iamvignesh/myfirstjava:v1.0
docker push index.docker.io/iamvignesh/myfirstjava:v1.0
```

## If using Docker Hub build:
Docker File: /Dockerfile

Build context: /Projects/myFirstJava/


## Run docker container - Java App
```
docker run -p 5000:5000 iamvignesh/myfirstjava:v1.0
```

## Output:

{"message":"My First Java using Docker v1"}
