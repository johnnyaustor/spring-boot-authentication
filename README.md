# Spring Boot Security JWT Authentication

ini adalah contoh menggunakan spring boot security json web token (jwt), 
jika ingin mencoba silahkan gunakan `docker pull johnnyaustor/jap-spring-boot-auth`

## Route
* `localhost:8080/swagger-ui.html` documentation
* `localhost:8080/h2-console` database
* POST `localhost:8080/auth/login`
* POST `localhost:8080/auth/register`
* GET `localhost:8080/auth/profile` membutuhkan header Authorization
* GET `localhost:8080/hello` membutuhkan header Authorization

## Docker
#### Docker Build Image
`docker build -t johnnyaustor/jap-spring-boot-auth .`

#### Docker Run
`docker run -d -p 8080:8080 --name jap-boot-auth johnnyaustor/jap-spring-boot-auth`

#### Docker Pull
`docker pull johnnyaustor/jap-spring-boot-auth`