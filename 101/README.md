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







