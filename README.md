# Basic Spring application with MongoDB

* This is a basic spring application designed to work with MongoDB.
* It includes a simple REST API to perform CRUD operations on a MongoDB collection.
* The application is built using Spring Boot and uses the Spring Data MongoDB library to interact with the database.
* The application is designed to be easy to set up and run, and can be used as a base for further mongoDB projects.
* The application uses docker-compose to run MongoDB, and the Java application in linked docker containers.
* The endpoints are as follows -
  * localhost:8080/ - "Hello, MongoDB!"
  * localhost:8080/health - "OK"
  * localhost:8080/grocery/add - Adds grocery item passed as JSON in the request body
  * localhost:8080/grocery/get/{name} - Gets the grocery item with the given name if it exists