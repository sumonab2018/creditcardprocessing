"# creditcardprocessing" 
This is a Java / Maven / Spring Boot (version 2.2.4) application for creating a microservice complete with built-in health check, metrics and much more.

## How to Run 

This application is packaged as a jar which has Tomcat 8 embedded. You run it using the ```java -jar``` command.

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar -Dspring.profiles.active=test target/creditcardprocessing.jar
or
        mvn spring-boot:run -Drun.arguments="spring.profiles.active=test"

Once the application runs you should see something like this

```
2021-03-07 22:54:41.106  INFO 31740 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8443 (https) 8080 (http) with context path ''
2021-03-07 22:54:41.107  INFO 31740 --- [  restartedMain] c.cards.CreditcardprocessingApplication  : Started CreditcardprocessingApplication in 1.604 seconds (JVM running for 7391.721)
```

## About the Service

The service is credit card system exposed as a REST service. It uses an in-memory database (H2) to store the data. 
More interestingly, you can start calling some of the operational endpoints (see full list below) like ```/actuator/health``` (these are available on **port 8443**)

 
Here is what this little application demonstrates: 

* Full integration with the latest **Spring** Framework: inversion of control, dependency injection, etc.
* Packaging as a single jar with embedded container (tomcat 8)
* Demonstrates how to set up healthcheck, metrics, info, environment, etc. endpoints automatically on a configured port. 
* *Spring Data* Integration with JPA/Hibernate
* Automatic CRUD functionality against the data source using Spring *Repository* pattern
* Demonstrates MockMVC test framework with associated libraries
* All APIs are "self-documented" by Swagger2 using annotations 

