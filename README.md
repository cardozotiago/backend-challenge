# Web API to validation password
This is a sample Java / Maven / Spring Boot (version 2.4.2) application that can be used as a starter for creating a microservice complete with built-in health check, metrics and much more. I hope it helps you.

# How to Run
This application is packaged as a war which has Tomcat 9 embedded. No Tomcat or JBoss installation is necessary.

- Clone this repository;
- Make sure you are using JDK 11;
- You can build the project and run the tests by running mvn clean package;
- Once successfully built, you can run the service running BackencChallengeApplication class, where exists run method.

# How to Test
 In our example I used postman, add the url: http://localhost:8080/password/validate/XXXX where 'XXXX' is the password you want to validate.
 
# To view Swagger 2 API docs and api description page
Run the server and browse to http://localhost:8080/v2/api-docs or http://8080/swagger-ui.html

# Tecnologies Solutions(reasons)
- Spring Boot: 
It allows you to have an application running in production quickly, since it already offers most of the resources ready for use, shortening the code length and following the best design practices with already optimized configurations. Thus, reducing development time and creating the entire application structure with less or almost no configuration. In short, it saves you more time programming than setting up the desktop.

- Swagger:
Model and document REST APIs and also due to the knowledge acquired in previous projects.

- JUnit:
The advantage of doing tests is knowing if the method is meeting the requirements specified in the test itself. You can modify your normal methods and run JUnit to see if your changes have not compromised the result of the modified method.
