# 🎬 Movie Manager API

[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-green?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge&logo=docker)](https://www.docker.com/)

A robust RESTful backend application for managing a movie collection. This project implements a clean architecture pattern using **Spring Boot**, **Java 21**, and **Maven**, featuring a responsive dark-mode frontend for interactive testing.

---

## 📸 Demo Application

### 1. The Dashboard (Desktop)
*A complete overview allowing users to view the movie library and add new entries.*
![Dashboard Screenshot](./screenshots/dashboard-desktop.png)
*(Place your screenshot here: create a folder named 'screenshots' in your project root and add the image)*

### 2. Adding a Movie (Validation)
*Demonstration of input validation and error handling.*
![Add Movie Screenshot](./screenshots/add-movie-validation.png)
*(Place your screenshot here)*

### 3. Responsive Mobile View
*The application is fully responsive and works on mobile devices.*
![Mobile Screenshot](./screenshots/mobile-view.png)
*(Place your screenshot here)*

---

## 🚀 Features

* **RESTful API Endpoints:** Clean endpoints for Creating and Retrieving data.
* **In-Memory Storage:** Uses a thread-safe implementation for data persistence during the session.
* **Input Validation:** Robust server-side validation using Jakarta Validation (`@NotBlank`, `@Min`).
* **Global Exception Handling:** User-friendly error messages returned as JSON.
* **Interactive Frontend:** A Netflix-inspired HTML/JS dashboard embedded in the application.
* **Dockerized:** Fully containerized with a multi-stage Dockerfile for easy deployment.

---

## 🛠️ Tech Stack

* **Language:** Java 21
* **Framework:** Spring Boot 3
* **Build Tool:** Maven
* **Containerization:** Docker
* **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API)

---

## ⚙️ How to Run

### Option A: Using Docker (Recommended)
You can build and run the application without installing Java locally.

1.  **Build the Image:**
    ```bash
    docker build -t movie-api .
    ```
2.  **Run the Container:**
    ```bash
    docker run -p 8080:8080 movie-api
    ```
3.  **Access the App:** Open `http://localhost:8080` in your browser.

### Option B: Running Locally (Maven)
Prerequisites: Java 21 and Maven installed.

1.  **Clone the repository:**
    ```bash
    git clone <your-repo-link>
    ```
2.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
3.  **Access the App:** Open `http://localhost:8080` in your browser.

---

## 🔌 API Reference

You can test the API using the built-in dashboard or tools like Postman/cURL.

### 1. Add a New Movie
* **Endpoint:** `POST /api/movies`
* **Content-Type:** `application/json`
* **Body:**
    ```json
    {
      "title": "Inception",
      "description": "A thief who steals corporate secrets through the use of dream-sharing technology...",
      "genre": "Sci-Fi",
      "releaseYear": 2010
    }
    ```

### 2. Get All Movies
* **Endpoint:** `GET /api/movies`
* **Response:** JSON Array of all movies.

### 3. Get Movie by ID
* **Endpoint:** `GET /api/movies/{id}`
* **Example:** `/api/movies/1`

---

## 📂 Project Structure

```text
src/
├── main/
│   ├── java/com/example/movieapi/
│   │   ├── controller/      # REST Controllers (API Endpoints)
│   │   ├── model/           # Data Entities (POJOs with Validation)
│   │   ├── service/         # Business Logic & Data Storage
│   │   └── exception/       # Global Exception Handlers
│   └── resources/
│       └── static/
│           └── index.html   # Frontend Dashboard
└── Dockerfile               # Multi-stage Docker build config
```
---

## 🔮 Future Improvements

* Implement a persistent database (H2, MySQL, or MongoDB).
* Add `PUT` (Update) and `DELETE` endpoints.
* Implement Spring Security for API protection.
