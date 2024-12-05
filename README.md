## Movie Application 
## Overview 
The Movie Application is a RESTful web service built with Spring Boot, PostgreSQL, and Spring Security, featuring user authentication via JWT (JSON Web Token). The application allows users to register, log in, and manage movies while adhering to modern security standards and best practices.

## Features 
User Registration: Secure user registration with encrypted passwords.
Authentication: JWT-based authentication for secure access to APIs.
Authorization: Role-based access control for endpoints (e.g., ADMIN and USER roles).
Movie Management: CRUD (Create, Read, Update, Delete) operations for managing movies.
Database Integration: PostgreSQL for persistent data storage.
Modern Security: Implemented Spring Security with JWT for token-based access.
###Technologies Used
Backend: Spring Boot
Security: Spring Security, JWT
Database: PostgreSQL
ORM: Hibernate (JPA)
Build Tool: Maven
Java Version: 17+
Prerequisites
Before running the project, ensure the following tools are installed:

Java 17 or later
Maven: Dependency management and build tool
PostgreSQL: Database server
IntelliJ IDEA: (Optional) IDE for development
###Getting Started
Clone the Repository
git clone https://github.com/fabriceCODER/movieApp-springboot.git
cd movie-application

## Configure the Database
Create a PostgreSQL database:

CREATE DATABASE movie_app;
Update the database connection properties in src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/movie_app
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

###Build and Run the Application
Build the application:
mvn clean install
Run the application:

mvn spring-boot:run
The application will start on http://localhost:8080.

## API Endpoints
Authentication Endpoints
Method	Endpoint	Description	Auth Required
POST	/api/auth/login	User login	No
POST	/api/auth/register	User registration	No
Movie Endpoints
Method	Endpoint	Description	Role
GET	/api/movies	Get all movies	USER, ADMIN
POST	/api/movies	Add a new movie	ADMIN
PUT	/api/movies/{id}	Update an existing movie	ADMIN
DELETE	/api/movies/{id}	Delete a movie	ADMIN
###JWT Authentication
Obtain a JWT token by logging in at /api/auth/login with valid credentials.
Include the token in the Authorization header for protected endpoints:

Authorization: Bearer <token>
## Project Structure
src/main/java/dev/fabish/movieApp
│
├── config          # Spring Security and JWT configurations
├── controller      # REST controllers for handling API requests
├── entity          # JPA entities representing database tables
├── repository      # JPA repositories for database interactions
├── service         # Business logic services
├── filter          # JWT filter for request validation
├── utils           # Utility classes (e.g., JWT utilities)
## Future Improvements
Pagination and Sorting: Add support for paginated movie lists.
User Profiles: Enable user-specific movie preferences and settings.
Unit Tests: Add comprehensive test coverage for all endpoints.
Frontend Integration: Create a user-friendly frontend for interacting with the API.
###Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License.

## Contact
For any questions or feedback, feel free to reach out:

Name: Fabrice Ishimwe
Email: fabriceishimwe@rca.ac.rw
GitHub: Fabrice
