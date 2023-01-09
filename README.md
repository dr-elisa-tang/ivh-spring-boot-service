# ivh-spring-boot-service
Backend Spring Boot Java Service

## Build and run containerized environment
#Build docker imaged
```
docker build -t ivh-service 
```
#Run docker image and create container
```
docker run -p 8080:8080 -t ivh-service
```

## Compile and build locally
#Builds and Compile packages (Builds the JAR file)
```
./mvnw package
```

#Runs the JAR
```
java -jar target/spring-boot-docker-0.0.1-SNAPSHOT.jar
```