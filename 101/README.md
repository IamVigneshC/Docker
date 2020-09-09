# Docker 101: 

## Run Interactive Container

` $ sudo docker run −i −t ubuntu /bin /bash `

sudo : Docker has to be run as root!

• run : we are running a container

• -i -t : we want a terminal (stdin and stdout), and we want to be connected to those so we can interact with the container

• ubuntu : The base image for this container

• /bin/bash : Let’s run bash


` $ sudo docker run −i −t ubuntu /bin/bash `

root@03711559d57d : / # cat / etc /* release *
DISTRIB ID=Ubuntu
DISTRIB RELEASE=12.04
DISTRIB CODENAME=p r e c i s e
DISTRIB DESCRIPTION=” Ubuntu 1 2. 0 4 LTS”
root@03711559d57d : / # exit


## Run Non-Interactive Container

Flags -i and -t are good for interacting with a container, but for scripting or long-running tasks, you’ll want to use detached (-d) mode

` $ sudo docker run −d ubuntu /bin/bash −c "echo hi" `

94490365f464bab1f009ec0fa
$

Odd things:

• There was no ‘hi’

• You were given this long string

• You are back at your original shell, even though you ran bash

In detached mode, docker immediately returns a container ID. This ID can be used to fetch container stdout, check container status, stop the container, etc


Ok, let’s see what’s happening using our container ID

` $ sudo docker logs d202687 `

hi

docker ps shows you what containers are running:

` $ sudo docker ps `

CONTAINER ID IMAGE         COMMAND             CREATED      STATUS

d2026870ef   ubuntu:12.04 /bin/bash −c while t 1 minute ago Up 1 min


## More on Container IDs

Typically, you will want to store the ID

` $ MY_ECHO=$(sudo docker run −d ubuntu /bin/bash 
−c ”echo hi”)
$ sudo docker logs $MY_ECHO `

hi 

### Detached Mode (e.g. docker run -d)

• Docker run response is the container ID

• To capure the output, we use $(...)

• This output is stored into variable MY ECHO and later retrieved with $MY ECHO

### Interactive Mode (e.g. docker run -i -t)

• Run container, modify, then exit. Container is now stopped

• Use docker ps -a to show all containers, incl. stopped ones

• Or use docker ps -l -q to show the last container ID


` $ sudo docker ps −a `

CONTAINER ID IMAGE COMMAND CREATED STATUS

d2026870ef ubuntu:12.04/bin/bash −c while t 1 minute ago Exit 0


` $ sudo docker ps −q −l `

d2026870ef


## Storing A Container For Reuse


• docker commit converts this container filesystem into an image

• The image can then be used to run other containers

` $ sudo docker commit $MY_ECHO iamvignesh/myapp `

If you could share this image...then others could build new containers based on this image!


## Sharing An Image For Reuse

• Images can be shared using a registry

• docker push and docker pull

• There is a public registry available, or your company can host it’s own private registry

If docker run does not find the image locally, it will automatically search known registries

` $ sudo docker push iamvignesh/myapp `

` $ sudo docker pull iamvignesh/myotherapp `

