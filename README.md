

# Library Management System



## Overview

The Library Management System is a Java-based application designed to streamline the operations of a library, including managing books, members, transactions, and more. This project serves as a comprehensive solution for libraries to efficiently organize and handle various tasks related to book management and user interactions.

## Technologies Used

- [**Java :**](https://www.java.com) Core programming language for development.

- [**Hibernate :**](https://hibernate.org) Object-relational mapping for simplified database interactions.

- [**Spring :**](https://spring.io) Infrastructure support for managing components and implementing business logic.

- [**Spring Boot :**](https://spring.io/projects/spring-boot) Streamlined development of production-ready applications.

- [**REST API :**](https://restfulapi.net) Enables standardized and scalable communication between components.

- [**Postman :**](https://www.postman.com) Used for testing and documenting the REST API.

These technologies collectively contribute to a robust and efficient Library Management System.

## Features

- **Book Management :** Add, update, and delete books from the catalog. Check the availability status of each book.

- **Member/User Management :** Maintain a record of library members, including their personal details and membership information.

- **Transaction/Loan Handling :** Facilitate book checkouts and returns. Calculate fines for overdue books.

- **Catalog/Inventory Management :** Keep track of the library's catalog, including the quantity available, acquisition date, and shelf location.

- **Reservation System :** Allow users to reserve books, manage reservations, and process them when books become available.

- **Fine/Penalty System :** Track fines incurred by members for overdue books and enable payment processing.

- **Library Staff Management :** Manage information about library staff members, their roles, and contact details.

- **Library Branch Information :** Maintain details about different library branches, including location and operating hours.

## Getting Started

To run the Library Management System on your local machine, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/adityakalambe01/Library-Management-System.git
    ```
   
2. Navigate to the project directory:
    ``` bash
   cd library-management-system
   ```
   
3. Modify src/main/resources/ modify and replace all of ```application.properties``` content with
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
   
5. Now Library Management System is ready to run go to the src/main/java/com and run ```MainProjectApplication.java```

# Acknowledgements

I would like to acknowledge that I am the sole contributor to this project. While the code and design are my own, the project wouldn't have been possible without the support and resources available in the open-source community.

Thank you.
---