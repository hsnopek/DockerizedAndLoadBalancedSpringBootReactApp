# DockerizedAndLoadBalancedSpringBootReactApp

This is example of how to dockerize web application with Spring boot backend and React frontend.
You will also learn how to setup nginx server as reverse proxy and load balancer.

## Steps
- Generate self-signed SSL certificate with mkcert or openSSL (https://github.com/FiloSottile/mkcert)
- Put generated certificates in "frontend/nginx/certs" folder
- Position yourself to project root and run start.sh. 
- Docker Compose command will then start two instances of API and nginx server on ports 80 and 443 to serve your frontend. Afterwards, you can visit https://localhost/ to see everything is working OK and that the site is secured with valid SSL certificate.

## Code
```sh
mkcert -install
mkcert -key-file localhost.key -cert-file localhost.cert localhost
./start.sh
```
