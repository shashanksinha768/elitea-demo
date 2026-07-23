Environment configuration

- application.properties contains development database settings and JVM options.
- Use environment variables for production credentials (SPRING_DATASOURCE_URL, SPRING_DATASOURCE_USERNAME, SPRING_DATASOURCE_PASSWORD).
- Example Docker env: SPRING_PROFILES_ACTIVE=prod
