<h1 align="center">
  Projeto Desafio Sistema de Lista de Compras

</h1>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Tarefa
- 
$ Metodo Post http://localhost:8080/listas

![Get-listas - AluraFilmes 23_12_2024 20_16_47](https://github.com/user-attachments/assets/7cfc0f78-0718-43bb-bb6d-4de904ff21b4)

```

- Listar Tarefas
```
$  Metodo Get http://localhost:8080/listas


![Get-listas - AluraFilmes 23_12_2024 20_16_30](https://github.com/user-attachments/assets/af95a6b4-f344-400b-a785-191a34fc0da4)

```

- Atualizar Tarefa
```
$ Metodo Put http://localhost:8080/listas/1

![Get-listas - AluraFilmes 23_12_2024 20_16_59](https://github.com/user-attachments/assets/34340aa5-ed31-46c9-a258-9309b65b0988)

```

- Remover Tarefa
```
Metodo Delete http://localhost:8080/listas/1

![Get-listas - AluraFilmes 23_12_2024 20_17_15](https://github.com/user-attachments/assets/e6be72ce-ce1e-43cd-9829-0be73f8168ed)


```
