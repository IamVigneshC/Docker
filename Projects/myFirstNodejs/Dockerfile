FROM node:8.16.1-alpine
WORKDIR /app
COPY package*.json ./
RUN npm install
EXPOSE 5000
COPY . /app
CMD node index.js

#ENTRYPOINT ["node", "index.js"]
#COPY package.json /app


#FROM node:12

  # Create app directory
#WORKDIR /usr/src/app

  # Install app dependencies
  # A wildcard is used to ensure both package.json AND package-lock.json are copied
  # where available (npm@5+)
#COPY package*.json ./

#RUN npm install
  # If you are building your code for production
  # RUN npm ci --only=production

  # Bundle app source
#COPY . .

#EXPOSE 8080
#CMD [ "node", "server.js" ]
