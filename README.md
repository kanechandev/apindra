# 📘 API de Usuários - Spring Boot

Este projeto é uma API RESTful para gerenciamento de usuários, construída com Spring Boot. Permite criar, listar, atualizar, buscar e deletar usuários com integração ao banco de dados H2 e documentação automática com Swagger.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Swagger/OpenAPI (`springdoc-openapi`)

---

## ⚙️ Como rodar o projeto

### 1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-projeto.git
cd seu-projeto
```

### 2. Execute com Maven:

```bash
./mvnw spring-boot:run
```

Ou execute a classe `UsuarioApiApplication.java` diretamente pela sua IDE (IntelliJ, Eclipse, VS Code).

---

## 🧪 Endpoints da API

| Método | Endpoint        | Descrição                     |  


| GET    | `/users`         | Lista todos os usuários       |  

| GET    | `/users/{id}`    | Busca usuário por ID          |  

| POST   | `/users`         | Cria um novo usuário          |  

| PUT    | `/users/{id}`    | Atualiza um usuário existente |  

| DELETE | `/users/{id}`    | Deleta um usuário             |

---

## 🧾 Exemplo de JSON para criação de usuário

```json
{
  "nome": "Kane San Chan",
  "email": "kane@exemplo.com"
}
```

---

## 📚 Acessos úteis

- **Swagger UI:** http://localhost:8080/swagger-ui.html
- **H2 Console:** http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:usuarios`
  - Usuário: `sa`
  - Senha: *(em branco)*

---

## ✍️ Autor

**Kane San Chan**  
Desenvolvedor Java e entusiasta de boas práticas de arquitetura, qualidade de código e documentação de APIs.

---

## 📄 Licença

Este projeto está sob a licença MIT. Você pode usá-lo, modificá-lo e distribuí-lo conforme desejar.
