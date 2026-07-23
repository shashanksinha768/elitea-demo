# elitea-capstone-project

Application Name: elitea-capstone-project

Project Overview:
A Java Spring Boot capstone application scaffold intended as a starting point for the EliteA Documentation Sync pipeline. This repository provides a complete starter structure, build configuration, CI workflow, Docker support, example REST endpoints, and documentation so teams can quickly extend it into a production service.

Business Purpose:
Provide a well-documented, automatable template for delivering microservice-style Spring Boot applications with standard observability, build, and deployment scaffolding suitable for enterprise documentation ingestion.

Tech Stack:
- Language / Runtime: Java 17 (LTS)
- Framework: Spring Boot 3.x
- Build Tool: Maven
- Web: Spring Web (REST)
- Persistence: H2 (development); MySQL connector included as optional
- Containerization: Docker / docker-compose
- CI: GitHub Actions

Installation
1. Clone the repository:
   git clone https://github.com/shashanksinha768/elitea-demo
2. Change directory:
   cd elitea-demo

Build Instructions
- Using Maven:
  mvn clean package

Run Instructions
- Run locally with Maven:
  mvn spring-boot:run
- Run the packaged JAR:
  java -jar target/elitea-capstone-project-0.1.0.jar
- Run with Docker:
  docker build -t elitea-capstone-project .
  docker run -p 8080:8080 elitea-capstone-project

Testing
- Run unit tests:
  mvn test

Deployment
- CI builds and runs tests via GitHub Actions (.github/workflows/build.yml)
- Docker image can be published to your container registry of choice (not configured by default)

Maintainers
- GitHub: shashanksinha768
- Maintainer email: Not Found

GitHub Repository URL
https://github.com/shashanksinha768/elitea-demo

Last Updated: 2026-07-23
