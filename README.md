# Projeto API de Restaurante

## Descrição

Este projeto é uma API de restaurante desenvolvida em Java utilizando Spring Boot. A API permite gerenciar informações sobre pratos, bebidas e restaurantes, incluindo operações básicas de CRUD (Create, Read, Update, Delete).

## Estrutura do Projeto

O projeto é dividido nas seguintes principais partes:

- **Entidades**: Representam os modelos de dados para `Prato`, `Bebida`, e `Restaurante`.
- **Repositórios**: Interfaces que extendem `JpaRepository` para banco de dados.
- **Serviços**: Contêm a lógica para manipulação de entidades.
- **Controladores**: Endpoints REST para a API.

## Dependências

- Java 17
- Spring Boot 3.2.8
- H2 Database (para testes)
- PostgreSQL (para produção)
- Gradle (para build)

## Configuração do Ambiente

1. **Clonar o Repositório**

   ```bash
   git clone https://github.com/pkz074/dio-trilha-java-basico.git
   cd dio-trilha-java-basico

2. **Configurar o Banco de Dados**

   H2: Configurado para testes, geralmente em memória.
   PostgreSQL: Configurado para produção.
   Atualize as credenciais e URL do banco de dados em application.properties.

3. **Construir o Projeto**

   Execute o comando abaixo para construir o projeto usando Gradle:
   "./gradlew build"

4. **Execute**
   
   "./gradlew bootRun"
