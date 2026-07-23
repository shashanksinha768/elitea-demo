#!/usr/bin/env bash
set -euo pipefail

mvn clean package

docker build -t elitea-capstone-project .

docker-compose up -d

echo "Application should be available at http://localhost:8080/api/v1/health"
