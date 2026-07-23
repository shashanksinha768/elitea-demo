# Architecture - elitea-capstone-project

System Overview
The elitea-capstone-project is a single Spring Boot microservice exposing REST endpoints. It is designed as a starting point for larger microservice architectures and includes configuration for local containerized deployment.

Components
- Web Layer: Spring Web controllers under com.elitea.demo.controller
- Application Entry: com.elitea.demo.EliteaCapstoneApplication
- Persistence: Spring Data JPA (H2 for dev; MySQL for production)
- Observability: Spring Boot Actuator (health, info)

Data Flow
1. Client sends HTTP request to REST endpoint (e.g., /api/v1/health).
2. Spring DispatcherServlet routes request to controller.
3. Controller invokes services/repositories (not implemented in scaffold).
4. Persistence layer (JPA) interacts with configured datasource.

External Integrations
- Relational Database: MySQL (production), H2 (development)
- Containerization: Docker
- CI/CD: GitHub Actions
- Monitoring: Actuator endpoints; integrate Prometheus/Grafana as needed.

Infrastructure Recommendations
- Deploy container images to the organization's container registry.
- Use an external managed database in production (RDS, Cloud SQL).
- Place service behind API Gateway / Load Balancer.
