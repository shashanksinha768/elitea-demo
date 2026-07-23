Operations runbook (starter):

- Start locally: mvn spring-boot:run
- Build docker: docker build -t elitea-capstone-project .
- Start local containers: docker-compose up -d
- Health check endpoint: GET /api/v1/health
- Logs: docker-compose logs -f elitea-capstone
