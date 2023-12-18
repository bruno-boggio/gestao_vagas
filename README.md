# Projeto de Cadastro de Empresas

## Descrição do Projeto

Este projeto oferece uma solução eficiente para cadastro de empresas, usuários e vagas, usando tecnologias modernas. Empresas podem criar vagas e usuários se candidatam a oportunidades.

## Tecnologias Utilizadas

- **Java Spring:** Framework robusto e modular.
- **Maven:** Gerenciamento de dependências e construção do projeto.
- **Autenticação JWT:** Segurança nas transações.
- **Spring Hibernate:** Integração eficiente com o Hibernate.
- **Spring JPA:** Facilita o acesso ao banco de dados.
- **Banco de Dados PostgreSQL:** Armazena informações.

## Funcionalidades

### Cadastro de Empresas

- Registro de empresas com informações essenciais.
- Autenticação segura para controle de acesso.

### Cadastro de Vagas

- Empresas podem criar e gerenciar vagas.
- Detalhes específicos incluídos, como descrição, requisitos e benefícios.

### Cadastro de Usuários

- Usuários registram habilidades e experiências.
- Autenticação JWT garante segurança no login.

### Candidatura a Vagas

- Usuários visualizam e se candidatam a vagas compatíveis.

## Instruções de Execução

### Pré-requisitos

- Java e Maven instalados.
- PostgreSQL configurado.

### Configuração do Banco de Dados

1. Execute os scripts SQL no diretório "scripts" para criar o esquema e tabelas.

### Configuração do Projeto

1. Modifique o arquivo `application.properties` para refletir suas configurações, incluindo as credenciais do banco de dados.

### Execução do Projeto

1. Execute o projeto com o Maven: `mvn spring-boot:run`.
2. Acesse o aplicativo em http://localhost:8080.
