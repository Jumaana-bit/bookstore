# Digital Library Application

## Overview

The Digital Library application is a web-based platform designed to provide access to a collection of digital books without the need for borrowing. It serves as an online repository where users can explore and read books directly on the site. The inspiration for this website comes from the Internet Archive, and all the books included are under the public domain.

## Features

- Display a collection of digital books with their details (title, author, and cover image).
- Allow users to read books directly on the website using an embedded PDF viewer.
- Responsive design for optimal viewing across various devices.
- Simple and intuitive user interface for easy navigation through the library.

### Running the Application

1. **Clone the Repository**

    Start by cloning the project repository to your local machine using:

    ```bash
    git clone https://github.com/Jumaana-bit/bookstore.git
    ```

2. **Navigate to Project Directory**

    Change into the project directory:

    ```bash
    cd bookstore
    ```

3. **Build the Project**

    Use Maven to build the project:

    ```bash
    mvn clean install
    ```

    To skip the tests during the build, you can add the `-DskipTests` flag:

    ```bash
    mvn clean install -DskipTests
    ```

4. **Run the Application**

    Launch the application using Spring Boot Maven plugin:

    ```bash
    mvn spring-boot:run
    ```


## Technologies Used

- **Spring Boot** for backend development and RESTful services.
- **Thymeleaf** as the template engine for server-side rendering.
- **Bootstrap 5** for responsive and modern CSS design.
- **Java Persistence API (JPA)** for data persistence.
- **H2 Database** for an in-memory database during development.

## Demo
https://github.com/user-attachments/assets/e491b91b-eb8a-48b7-b3d0-1ec7be8739a3

## License
All books included in this application are under the public domain. This project itself is open-source. 

