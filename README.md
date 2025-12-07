# courses-api

API como projeto prático da disciplina de Linguagem de Programação II.

## Descrição

Este projeto consiste na implementação de uma API desenvolvida em Java como atividade prática para a disciplina de Linguagem de Programação II. O objetivo é proporcionar experiência no desenvolvimento de aplicações backend, utilizando conceitos aprendidos em sala de aula.

## Funcionalidades

- CRUD (Create, Read, Update, Delete) de cursos
- Cadastro e gerenciamento de dados dos cursos
- Endpoints RESTful para integração com outros sistemas/clientes

## Tecnologias Utilizadas

- **Java** (100%)
- Frameworks/Bibliotecas: Spring Boot
- Banco de Dados: PostgreSQL
- Maven para gerenciamento de dependências

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/tiago-rodrigues1/courses-api.git
   ```

2. Entre na pasta do projeto:
   ```bash
   cd courses-api
   ```

3. Instale as dependências e execute a aplicação (ajuste conforme o build tool/framework):
   ```bash
   ./mvnw spring-boot:run
   ```
   ou
   ```bash
   ./gradlew bootRun
   ```

3.1. Suba o banco de dados
```bash
docker compose up -d
```

4. Acesse a API pelo navegador ou via ferramentas como [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/), utilizando `http://localhost:8080` como base URL.

## Estrutura do Projeto

```
src/
 └── main/
     ├── java/
     │    └── ... (código fonte)
     └── resources/
          ├── application.properties
          └── ... (outros recursos)
```
