# Spring Boot Category and Product Management API

## Description

This is a *Spring Boot* project that provides a REST API for managing *Categories* and *Products* with a *One-to-Many* relationship. The application includes basic *CRUD operations* for both entities with *server-side pagination* for listing categories and products. The project uses *Spring Data JPA* and *Hibernate* for database management, with *MySQL* as the RDBMS.

## Features

- *Category Management*: Create, Read, Update, and Delete categories.
- *Product Management*: Create, Read, Update, and Delete products, with automatic association to categories.
- *One-to-Many Relationship*: One category can have many products.
- *Pagination*: Server-side pagination for listing categories and products.
- *Database*: MySQL as the database with JPA & Hibernate for ORM.
- *Annotation-based configuration*: No XML configuration used.
  
## Technologies Used

- *Spring Boot* (version 2.x)
- *Spring Data JPA* for data persistence
- *Hibernate* for ORM (Object-Relational Mapping)
- *MySQL* for the database
- *Lombok* to reduce boilerplate code
- *JUnit & Mockito* for testing
- *Maven* for dependency management

## Prerequisites

To run this project, you need to have the following installed:

- Java 8 or higher
- Maven 3.x
- MySQL

## Setup and Installation

1. *Clone the repository*:

   ```bash
   git clone https://github.com/yourusername/your-repository.git
   cd your-repository
Configure the database:

Create a MySQL database and update your database configurations in src/main/resources/application.properties.

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build the project:

Use Maven to build the project:

bash
Copy code
mvn clean install
Run the application:

Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
Access the API:

The application will be available at http://localhost:8080.

API Documentation
Category APIs
GET All Categories (Paginated)

http
Copy code
GET /api/categories?page=0
Response: List of categories (10 per page).

GET Category by ID

http
Copy code
GET /api/categories/{id}
Response: Category details for the given ID.

POST Create a New Category

http
Copy code
POST /api/categories
Request Body:

json
Copy code
{
  "name": "New Category"
}
PUT Update Category by ID

http
Copy code
PUT /api/categories/{id}
Request Body:

json
Copy code
{
  "name": "Updated Category Name"
}
DELETE Category by ID

http
Copy code
DELETE /api/categories/{id}
Product APIs
GET All Products (Paginated)

http
Copy code
GET /api/products?page=0
Response: List of products (10 per page).

GET Product by ID

http
Copy code
GET /api/products/{id}
Response: Product details for the given ID, including category details.

POST Create a New Product

http
Copy code
POST /api/products?categoryId={categoryId}
Request Body:

json
Copy code
{
  "name": "New Product",
  "description": "Product description",
  "price": 100.0
}
PUT Update Product by ID

http
Copy code
PUT /api/products/{id}
Request Body:

json
Copy code
{
  "name": "Updated Product Name",
  "description": "Updated description",
  "price": 120.0,
  "category": {
      "id": 1
  }
}
DELETE Product by ID

http
Copy code
DELETE /api/products/{id}
Database Schema
The application uses two tables: Category and Product.

Category:

id: Primary Key
name: Name of the category
One category can have many products.
Product:

id: Primary Key
name: Name of the product
description: Description of the product
price: Price of the product
category_id: Foreign key to the Category table (One-to-Many relationship)
Testing
To run the unit tests, use the following command:

bash
Copy code
mvn test
Unit tests are written using JUnit and Mockito to test the service and controller layers.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Contact
For any queries or issues, contact me at: your.email@example.com

markdown
Copy code

### Explanation:
- *Project Description*: Brief introduction and summary of the project.
- *Features*: Lists the main functionalities provided by the API.
- *Technologies*: Lists the tech stack used in the project.
- *Prerequisites*: Defines what is needed to run the project.
- *Setup and Installation*: Instructions on how to clone, set up, and run the project.
- *API Documentation*: Describes the API endpoints, their requests, and responses.
- *Database Schema*: Explains the table structure for Category and Product.
- *Testing*: Instructions on how to run unit tests.
- *License* and *Contributing* sections for standard open-source contribution practices.

You can modify this to match your project's specifics, such as your GitHub username, repository name,
