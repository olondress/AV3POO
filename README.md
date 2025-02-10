# Sistema de Gerenciamento de Pet Shop

Este projeto consiste em um sistema simples de gerenciamento de pet shop, implementado em Java. Ele permite a administração de animais, serviços oferecidos, clientes e funcionários, além de incluir funcionalidades de agendamento, registro de atendimentos e geração de relatórios. O sistema também gerencia usuários e utiliza arquivos .txt para persistência de dados.

## Índice
- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Exemplo de Uso](#exemplo-de-uso)

## Descrição do Projeto
O objetivo principal deste projeto é fornecer uma interface para gerenciamento de um pet shop que contemple diferentes serviços (banho, tosa, consulta veterinária, entre outros) e entidades envolvidas (animais, clientes e funcionários). O sistema possui funcionalidades básicas de um pet shop, como cadastrar animais, agendar serviços e listar atendimentos, além de persistir os dados em arquivos para garantir que informações sejam mantidas entre as execuções do programa.

## Funcionalidades
### Animais
- **Cadastrar animais**: Permite adicionar animais ao sistema, incluindo informações como espécie, raça e idade.
- **Listar animais**: Exibe todos os animais cadastrados.
- **Buscar animais**: Permite buscar animais por critérios como nome ou dono.

### Serviços
- **Agendar serviço**: Registra um agendamento para banho, tosa, consulta veterinária, entre outros.
- **Registrar atendimento**: Permite registrar o histórico de serviços realizados.
- **Gerar relatórios**: Gera relatórios dos serviços realizados e próximos agendamentos.

### Clientes e Funcionários
- **Cadastrar clientes**: Permite adicionar novos clientes ao sistema.
- **Cadastrar funcionários**: Gerencia os dados dos profissionais do pet shop.
- **Exibir informações**: Mostra os dados cadastrados de clientes e funcionários.

### Persistência de Dados
O sistema utiliza a classe `ArquivoUtil` para leitura e gravação de arquivos .txt, garantindo que os dados cadastrados sejam salvos entre as sessões.

## Estrutura do Projeto
A estrutura de pastas e classes está organizada da seguinte forma:

```
src/
├── exceptions/
│   ├── AnimalNaoEncontradoException.java
│   ├── ClienteNaoEncontradoException.java
│   ├── FuncionarioNaoEncontradoException.java
│
├── interfaces/
│   ├── Buscavel.java
│   ├── Agendavel.java
│   ├── Exibivel.java
│   ├── Relatavel.java
│
├── models/
│   ├── Animal.java
│   ├── Cliente.java
│   ├── Funcionario.java
│   ├── Servico.java
│   ├── Agendamento.java
│
├── services/
│   ├── ArquivoUtil.java
│   ├── PetShop.java
│
└── Main.java
```

## Tecnologias Utilizadas
- **Linguagem**: Java 8 ou superior
- **Persistência**: Arquivos .txt
- **Paradigma**: Programação Orientada a Objetos (POO)
- **Design**: Interface e abstração para modularidade

## Como Executar o Projeto
### Pré-requisitos:
- Ter o **Java JDK 8** ou superior instalado.
- Um editor ou IDE, como **IntelliJ IDEA** ou **Eclipse**.

### Passos para execução:
1. Clone o repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd petshop
   ```
2. Compile o código:
   ```sh
   javac -d bin src/**/*.java
   ```
3. Execute a aplicação:
   ```sh
   java -cp bin Main
   ```

## Exemplo de Uso
Após executar o sistema, o usuário pode:
- Cadastrar um animal informando seu nome, espécie e dono.
- Agendar um serviço de banho e tosa para um animal específico.
- Consultar a lista de atendimentos realizados e os próximos agendamentos.
- Gerar um relatório detalhado dos serviços prestados pelo pet shop.
