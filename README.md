# 📚 Book Management REST API

A Spring Boot-based RESTful web service to perform CRUD operations on books. Built using Java, Spring Boot, Spring Data JPA, and H2 database. 
Includes Swagger UI for API testing and JUnit for unit testing.

---

## 🚀 Features

- Add, view, update, and delete books
- RESTful APIs built with Spring Boot
- Input validation using Hibernate Validator
- Global exception handling
- In-memory H2 database (easy to switch to MySQL)
- API documentation via Swagger UI
- Unit testing with JUnit & Mockito

---

## 🛠 Tech Stack

| Technology     | Details                     |
|----------------|-----------------------------|
| Java           | 21                          |
| Spring Boot    | 3.5.3                       |
| Spring Data JPA| ORM & database interaction  |
| Database       | H2 (can switch to MySQL)    |
| API Docs       | Swagger / Springdoc OpenAPI |
| Testing        | JUnit, Mockito              |
| Build Tool     | Maven                       |
| IDE            | IntelliJ IDEA               |

---

## 📁 Project Structure
book-management/
├── controller/
├── service/
├── repository/
├── model/
├── exception/
└── resources/
├── application.properties
└── data.sql

---

📦 API Endpoints

| Method	   |   Endpoint	         |     Description            |
|------------|---------------------|----------------------------|
| GET	       |  /api/books/	       |     Get all books          |
| GET	       |  /api/books/{id}	   |     Get book by ID         |
| POST	     |  /api/books/	       |     Add new book           |
| DELETE	   |  /api/books/{id}	   |     Delete book by ID      |
| PUT        |  /api/books/{id}    |     Update existing book   |

---

🧰 Tools Used

Postman – API testing

Swagger UI – View and test API docs: http://localhost:8080/swagger-ui/index.html

---

Swagger UI Screenshots

![image](https://github.com/user-attachments/assets/542afc44-052e-4e09-82a1-28df15e54cb5)
![image](https://github.com/user-attachments/assets/15d46888-48d1-4900-b740-9ccc54405822)

---

🧠 Learning Outcomes
- How to build and structure a Spring Boot project
- Creating REST APIs and handling exceptions
- Applying validation patterns
- Writing unit tests and documenting with Swagger
