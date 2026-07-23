Deployment notes:

- CI builds with GitHub Actions. The workflow compiles and runs tests.
- For production, build container image and push to registry, then deploy using your platform (Kubernetes, ECS, etc.).
- Ensure external database and secrets are configured via environment variables or secret manager.
