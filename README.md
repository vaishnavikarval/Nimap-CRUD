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
- *Postman* for testing
- *Maven* for dependency management

## Prerequisites

To run this project, you need to have the following installed:

- Java 8 or higher
- Maven 3.x
- MySQL

The application will be available at http://localhost:8080.

API Documentation
Category APIs
GET All Categories (Paginated)

GET /api/categories?page=0
Response: List of categories (10 per page).

GET Category by ID


GET /api/categories/{id}
Response: Category details for the given ID.

POST Create a New Category


POST /api/categories
Request Body:

json
{
  "name": "New Category"
}
PUT Update Category by ID

PUT /api/categories/{id}
Request Body:

json
{
  "name": "Updated Category Name"
}
DELETE Category by ID

DELETE /api/categories/{id}
Product APIs
GET All Products (Paginated)

GET /api/products?page=0
Response: List of products (10 per page).

GET Product by ID

GET /api/products/{id}
Response: Product details for the given ID, including category details.

POST Create a New Product

POST /api/products?categoryId={categoryId}
Request Body:

json
{
  "name": "New Product",
  "description": "Product description",
  "price": 100.0
}
PUT Update Product by ID

PUT /api/products/{id}
Request Body:

json
{
  "name": "Updated Product Name",
  "description": "Updated description",
  "price": 120.0,
  "category": {
      "id": 1
  }
}
DELETE Product by ID

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


