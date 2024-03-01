# CRUD com Spring Boot
Este é projeto é uma API para gerenciar tarefas (CRUD). Foi desenvolvido como uma maneira de colocar em prática o que aprendi durante o curso de Java Completo da COD3R

## Tecnologias
- Spring Boot
- Spring Data JPA
- SpringDoc OpenAPI 3
- Mysql

## Como executar
- Clonar repositório GIT
- Criar database "todolist" no Mysql
```
    create database todolist;
```
- Configurar variáveis no application.properties
```
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
```
- Executar a aplicação

A API poderá ser acessada em [localhost:8080](http://localhost:8080/) e o Swagger (com os endpoints) poderá ser visualizado  em [localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html#/)



