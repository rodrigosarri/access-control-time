
# Controle de Acesso e Ponto de usuários

Esse é um projeto desenvolvimento para controle de acesso e ponto de usuários como parte do aprendizado no curso **Santander Bootcamp | Fullstack Developer** promovido pela *Digital Innovation One*

## Pré-requisitos

- Java 11.0.0
- Apache Maven 3.8.1


## Instalação

```console
git clone https://github.com/rodrigosarri/access-control-time.git
cd access-control-time
mvn clean install
mvn spring-boot:run
```

No arquivo `resources` estão as configurações do projeto para utilizar em ambiente de **dev** utilizando o banco de dados H2 ou em **prod** para utilização com banco de dados Mysql.


## Utilizando com banco de dados H2
Após rodar o projeto ele já está pré-configurado para utilização do banco de dados H2. Para acessar o banco de dados via navegador basta digitar no navegador: `http://localhost:8080/h2/` com as configurações:

```properties
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:act
User Name: sa
Password
```

![Banco de dados H2](https://universos.dev.br/database-h2.jpg)

## Utilizando com banco de dados MYSQL
Para rodar o projeto utilizando o banco de dados Mysql deve alterar no arquivo `application.properties` a chave `spring.profiles.active` de **dev** para **prod**.

Depois é necessário criar o banco de dados **act** utilizando o comando SQL:


```mysql
CREATE DATABASE IF NOT EXISTS act CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```

## Coleção Postman
Segue um arquivo de **collection** que você pode utilizar para importar em seu *Postman* com todos os endpoints e seus respectivos verbos.

[ACT.postman_collection](https://universos.dev.br/ACT.postman_collection.json)

## Contribuindo 
Solicitações pull são bem-vindas. Para mudanças importantes, abra um problema primeiro para discutir o que você gostaria de mudar.

Certifique-se de atualizar os testes conforme apropriado. 

## Licença
[MIT](https://choosealicense.com/licenses/mit/)
