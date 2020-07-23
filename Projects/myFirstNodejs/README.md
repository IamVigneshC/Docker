# Simple Node.js® Java Script App using Docker

## Registry/Repository: 
https://hub.docker.com/repository/docker/iamvignesh/myfirstnodejs

## Build, Tag, Push Image:
```sh
docker build -t iamvignesh/myfirstnodejs:v1.0 .

docker images
docker tag 76d03cf iamvignesh/myfirstnodejs:v1.0
docker push index.docker.io/iamvignesh/myfirstnodejs:v1.0
```

## If using Docker Hub build:
Docker File: /Dockerfile

Build context: /Projects/myFirstNodejs/


## Run docker container - NodeJS Java Script App
```
docker run -p 5000:5000 iamvignesh/myfirstnodejs:v1.0
```

## Output:

{"message":"My First JavaScript using Docker v1"}
