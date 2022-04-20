FROM node:14 AS builder
WORKDIR /app
# Copy all files from current directory to working dir in image
COPY . .
RUN yarn install && yarn build

FROM nginx:alpine
# Asset directory
WORKDIR /var/www/localhost
# Copying assets from builder stage
COPY --from=builder /app/build .
# Copying nginx configuration file to global nginx config path
COPY ./nginx/conf/nginx.conf /etc/nginx/nginx.conf
EXPOSE 80 443
ENTRYPOINT ["nginx", "-g", "daemon off;"]