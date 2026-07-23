Architecture diagram (text description):
- Client -> Load Balancer -> elitea-capstone (Spring Boot)
- elitea-capstone -> MySQL (production) or H2 (dev)
- Observability: Actuator endpoints, integrate Prometheus
