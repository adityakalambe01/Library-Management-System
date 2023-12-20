# Library Management System

## Overview

The Library Management System is a Java-based application designed to streamline the operations of a library, including managing books, members, transactions, and more. This project serves as a comprehensive solution for libraries to efficiently organize and handle various tasks related to book management and user interactions.

## Features

- **Book Management:** Add, update, and delete books from the catalog. Check the availability status of each book.

- **Member/User Management:** Maintain a record of library members, including their personal details and membership information.

- **Transaction/Loan Handling:** Facilitate book checkouts and returns. Calculate fines for overdue books.

- **Catalog/Inventory Management:** Keep track of the library's catalog, including the quantity available, acquisition date, and shelf location.

- **Reservation System:** Allow users to reserve books, manage reservations, and process them when books become available.

- **Fine/Penalty System:** Track fines incurred by members for overdue books and enable payment processing.

- **Library Staff Management:** Manage information about library staff members, their roles, and contact details.

- **Library Branch Information:** Maintain details about different library branches, including location and operating hours.

## Getting Started

To run the Library Management System on your local machine, follow these steps:

### Technologies Used

- **Java:**  Java is the core programming language used for the development of the Library Management System. Its platform independence and object-oriented features make it a versatile choice for building robust applications.
- **Hibernate:** Hibernate is an object-relational mapping (ORM) framework for Java that simplifies database interactions. It enables developers to work with databases using Java objects, providing a higher level of abstraction and eliminating the need for manual SQL queries.
- **Spring:** The Spring Framework is used to facilitate the development of the Library Management System. It provides comprehensive infrastructure support, making it easier to manage application components, handle data access, and implement business logic.
- **Spring Boot:** Spring Boot simplifies the process of building production-ready applications by providing convention-over-configuration and default settings. It includes an embedded web server, making it easy to create standalone, deployable applications.
- **REST API:** The Library Management System exposes a RESTful API to enable communication between different components. RESTful principles are followed for designing web services, allowing for standardized and scalable interactions.
- **Postman:** Postman is used for testing and documenting the REST API. It provides a user-friendly interface for making API requests, testing various endpoints, and generating documentation. Postman is particularly valuable during the development and testing phases of the project.


1. Clone the repository:
   ```bash
   git clone https://github.com/adityakalambe01/Library-Management-System.git
    ```
2. Navigate to the project directory:
    ``` bash
   cd library-management-system
   ```
   
3. Modify src/main/resources/application.properties and replace all with
   ```bash
   server.port=9090
   
   spring.mvc.view.prefix=/pages/
   
   spring.mvc.view.suffix=.jsp
   
   #modify port with your MySQL port ex jdbc:mysql://localhost:3306/project
   
   spring.datasource.url=jdbc:mysql://localhost:port/library_management_system
   
   #modify username and password
   
   spring.datasource.username=username
   
   spring.datasource.password=password
   
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   
   spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
   
   spring.jpa.hibernate.ddl-auto=update
   
   spring.jpa.show-sql=true
   
   #spring.jpa.generate-ddl=true
   
   spring.jackson.serialization.fail-on-empty-beans=false
   
4. Go to MySQL command line client and hit
   ```bash 
   create database library_management_system;