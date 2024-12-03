# Testes Automatizados com Selenium para a Aplicação Study Hub

Este repositório contém o conjunto de testes automatizados desenvolvidos com Selenium e JUnit para validar funcionalidades da aplicação **Study Hub**.

## Estrutura do Projeto

STUDYHUBSELENIUM/
├── drivers/
│   └── chromedriver.exe       # Driver necessário para executar os testes no navegador Chrome
│
├── src/
│   ├── main/                  # Diretório reservado para o código principal (não utilizado neste projeto)
│   │   └── java/              # (Vazio)
│   │
│   └── test/                  # Diretório que contém os arquivos de teste
│       └── java/
│           ├── tests/
│           │   ├── ArtigosTest.java       # Testes para a funcionalidade de artigos
│           │   ├── ComunidadeTest.java    # Testes para a funcionalidade de comunidade
│           │   └── TesteLoginTest.java    # Testes para a funcionalidade de login
│           └── utils/                     # Classes utilitárias
│               └── WebDriverFactory.java  # Configuração para inicialização de drivers
│
├── reports/                   # Diretório para armazenar relatórios gerados dos testes
│   └── test-report.html       # Relatório de execução (gerado automaticamente)
│
├── target/                    # Diretório gerado automaticamente pelo Maven para os arquivos compilados
│   └── ...                    # Arquivos temporários e gerados da build
│
├── pom.xml                    # Arquivo de configuração do Maven, contendo dependências e configurações do projeto
│
└── README.md                  # Documentação do projeto


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




