# API Documentation - elitea-capstone-project

API Overview
This project exposes a minimal REST API using Spring Web. The API is versioned under /api/v1.

Endpoints

1) GET /api/v1/health
- Description: Returns basic health status of the application.
- Request example:
  curl -X GET http://localhost:8080/api/v1/health
- Response example (200 OK):
  {
    "status": "UP",
    "service": "elitea-capstone-project"
  }

2) GET /api/v1/items
- Description: List all example items stored in the database.
- Request example:
  curl -X GET http://localhost:8080/api/v1/items
- Response example (200 OK):
  [
    {"id":1, "name":"sample"}
  ]

3) POST /api/v1/items
- Description: Create an example item.
- Request example:
  curl -X POST http://localhost:8080/api/v1/items -H "Content-Type: application/json" -d '{"name":"sample"}'
- Response example (201 Created):
  {"id":1, "name":"sample"}

Authentication
No authentication is implemented in the initial scaffold. Add Spring Security and OAuth2 / JWT as needed for production.

Error Handling
Standard Spring Boot error responses are returned for unhandled exceptions. Controllers should use @ExceptionHandler for domain-specific errors.

API Documentation
This file is intended to be machine-readable by documentation sync tools and contains endpoint examples, request/response samples and high-level descriptions.
