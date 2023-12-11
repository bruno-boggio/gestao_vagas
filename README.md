Projeto de Cadastro de Empresas
Descrição do Projeto
Este projeto foi desenvolvido utilizando tecnologias modernas para oferecer uma solução eficiente de cadastro de empresas, usuários e vagas. A principal funcionalidade permite que empresas criem novas vagas e usuários se candidatem para essas oportunidades.

Tecnologias Utilizadas
Java Spring: O framework Spring é a espinha dorsal do projeto, proporcionando uma arquitetura robusta e modular.
Maven: Utilizado para gerenciamento de dependências e construção do projeto.
Autenticação com JWT: A autenticação é realizada por meio de JSON Web Tokens (JWT), garantindo segurança e integridade nas transações.
Spring Hibernate: Integração do Hibernate com o Spring para mapeamento objeto-relacional eficiente.
Spring JPA: Implementação da JPA (Java Persistence API) do Spring para facilitar o acesso e manipulação de dados no banco.
Banco de Dados PostgreSQL: O PostgreSQL é utilizado como banco de dados principal para armazenar as informações relevantes.
Funcionalidades
Cadastro de Empresas:

Empresas podem se cadastrar no sistema, fornecendo informações essenciais.
Autenticação segura para garantir acesso controlado às funcionalidades.
Cadastro de Vagas:

Empresas têm a capacidade de criar e gerenciar vagas de emprego.
Cada vaga inclui detalhes específicos, como descrição, requisitos e benefícios.
Cadastro de Usuários:

Usuários podem se cadastrar no sistema, fornecendo informações sobre suas habilidades e experiências.
Autenticação JWT garante segurança durante o processo de login.
Candidatura a Vagas:

Usuários podem visualizar as vagas disponíveis e se candidatar para aquelas que correspondem às suas habilidades.
Instruções de Execução
Pré-requisitos:

Java e Maven instalados.
Banco de dados PostgreSQL configurado.
Configuração do Banco de Dados:

Execute os scripts SQL fornecidos no diretório "scripts" para criar o esquema e tabelas necessárias.
Configuração do Projeto:

Modifique o arquivo application.properties para refletir as configurações do seu ambiente, incluindo as credenciais do banco de dados.
Execução do Projeto:

Execute o projeto usando o Maven: mvn spring-boot:run.
O aplicativo estará acessível em http://localhost:8080.
