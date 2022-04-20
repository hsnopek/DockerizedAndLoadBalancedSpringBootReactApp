#!/bin/bash
set -e
#docker-compose build --no-cache
#docker-compose up --force-recreate -d --scale api=2
docker-compose up -d --scale api=2