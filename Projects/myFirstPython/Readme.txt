# Docker

## Registry/Repository: 
https://hub.docker.com/repository/docker/iamvignesh/myfirstpython

## Build, Tag, Push Image
docker build -t iamvignesh/myfirstpython:latest .

docker images
docker tag 76d03cf iamvignesh/myfirstpython:latest
docker push index.docker.io/iamvignesh/myfirstpython:latest

## Run docker - Python
docker run -p 5000:5000 iamvignesh/myfirstpython:latest

## Output

{"message":"My First Python v1"}
