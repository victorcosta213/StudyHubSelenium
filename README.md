# Testes Automatizados com Selenium para a Aplicação Study Hub

Este repositório contém o conjunto de testes automatizados desenvolvidos com Selenium e JUnit para validar funcionalidades da aplicação **Study Hub**.

## Estrutura do Projeto

A estrutura de diretórios está organizada da seguinte forma:



## Funcionalidades Testadas

Os testes estão organizados em três classes, cada uma cobrindo funcionalidades específicas da aplicação:

1. **Testes de Login (`TesteLoginTest.java`)**:  
   - Teste com credenciais válidas verifica se o usuário é redirecionado para a página principal após realizar login com sucesso.  
   - Teste com credenciais inválidas verifica se uma mensagem de erro é exibida quando o login falha (código comentado por necessidade de ajustes).  

2. **Testes de Artigos (`ArtigosTest.java`)**:  
   - Realiza buscas na seção de artigos, testando a interação com o campo de entrada e filtros disponíveis.  
   - Simula interações com menus suspensos e valida o comportamento esperado.  

3. **Testes de Comunidade (`ComunidadeTest.java`)**:  
   - Verifica a criação de uma nova postagem na comunidade.  
   - Valida interações com elementos visuais como botões e menus.  
   - Testa o comportamento ao editar e excluir postagens.

## Pré-requisitos

Antes de executar os testes, certifique-se de que os seguintes itens estão instalados:
- Java Development Kit (JDK) 8 ou superior
- Maven para gerenciar dependências
- Google Chrome e a versão correspondente do `chromedriver.exe`




