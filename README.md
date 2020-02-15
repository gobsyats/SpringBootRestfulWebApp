# SpringBootRestfulWebApp

The project is built for managing products.
Tools: Eclipse and MySQL

The whole tutorial is available at https://www.youtube.com/watch?v=3-5e5cXfwrU
Tutrorial by: CodeJava
Published on: Jan 8, 2020
Accessed on: Feb 15, 2020

The application is a Spring Boot MVC project and is built usind Spring starter project using dependencies:
MySQL connector, Spring Web and Spring Data JPA

JAVA files are present at:
https://github.com/gobsyats/SpringBootRestfulWebApp/tree/master/ProductREST.zip_expanded/ProductREST/src/main/java/com/code/java
Product - Main POJO class
ProductController - REST Controller for mapping of services
ProductRepository - Interface which extends JPARespository
ProductRestApplication - Entry Point of SpringBootApplication or contains main and run method
ProductService - Service class which has an instance of ProductRepository

application.properties (database config) is at
https://github.com/gobsyats/SpringBootRestfulWebApp/tree/master/ProductREST.zip_expanded/ProductREST/src/main/resources
