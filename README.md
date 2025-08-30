# Atividade de Prática 1 (AP1) de Programação Orientada a Objetos (POO)
Este repositório contém a resolução AP1 solicitada pela disciplina de Programação Orientada a Objetos da ULBRA, proposta para praticar e avaliar conceitos fundamentais da linguagem, como entrada e saída de dados (Scanner e JOptionPane), estruturas condicionais, laços de repetição e manipulação de variáveis.

## Pré-requisitos
Para compilar e executar os programas deste repositório, você precisa ter o Java Development Kit (JDK) instalado em seu computador. O JDK inclui tanto o compilador (javac) quanto o ambiente de execução (java), que são essenciais para rodar os arquivos.

### Guia de Instalação do JDK
Abaixo estão as instruções para instalar o JDK nos principais sistemas operacionais.

### Windows

 1. **Download**: Acesse a página [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) e baixe o instalador para Windows (geralmente um arquivo `.exe` ou `.msi`).

 2. **Instalação**: Execute o arquivo baixado e siga as instruções do assistente de instalação. Anote o diretório onde o JDK foi instalado (ex: `C:\Program Files\Java\jdk-21`).

 3. **Configurar Variáveis de Ambiente**:

    Pressione `Win + R`, digite `sysdm.cpl` e pressione Enter.

    Vá para a aba "Avançado" e clique em "Variáveis de Ambiente...".

    Em "Variáveis do sistema", clique em "Novo..." e crie a variável `JAVA_HOME` com o caminho da sua instalação do JDK (ex: `C:\Program Files\Java\jdk-21`).

    Encontre a variável Path, selecione-a, clique em "Editar...", depois em "Novo" e adicione a linha %JAVA_HOME%\bin.

 4. **Verificação**: Abra um novo Prompt de Comando (`cmd`) e digite `java -version` e `javac -version` para confirmar que a instalação foi bem-sucedida.

### macOS
 1. **Download**: Na página [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/), baixe o instalador para macOS (um arquivo `.dmg`).

 2. **Instalação**: Abra o arquivo `.dmg` e execute o instalador `.pkg`. Siga as instruções na tela. O macOS geralmente lida com a configuração do `PATH` automaticamente.

 3. **Verificação**: Abra o aplicativo Terminal e digite os comandos `java -version` e `javac -version` para verificar a instalação.

### Linux (Debian/Ubuntu)
A maneira mais fácil é usar o gerenciador de pacotes `apt`.

 1. **Atualizar Pacotes:** Abra o terminal e execute o comando:
    ```
    sudo apt update
    ```

 2. **Instalar o JDK:** Instale o pacote padrão do JDK com o comando:
    ```
    sudo apt install default-jdk
    ```

 3. **Verificação**: Após a conclusão, verifique a instalação com os comandos:
    ```
    java -version
    javac -version
    ```

O gerenciador de pacotes configurará as variáveis de ambiente automaticamente.

## Tarefas Desenvolvidas
Abaixo estão as descrições de cada uma das 7 tarefas e as instruções para compilá-las e executá-las a partir de um terminal.

### 1. Calculadora de Desconto
Descrição: O programa solicita ao usuário o valor original de um produto e a porcentagem de desconto a ser aplicada. Em seguida, calcula e exibe o valor do desconto em reais e o preço final do produto.

**Como executar:**
```
javac CalculadoraDeDesconto.java
java CalculadoraDeDesconto
```

### 2. Calculadora de ITBI
Descrição: Utilizando janelas gráficas (JOptionPane), o programa pede o valor de transação de um imóvel, o valor venal e a alíquota do imposto ITBI. O imposto é calculado com base no maior valor entre o de transação e o venal, conforme a regra geral.

**Como executar:**
```
javac CalculadoraDeITBI.java
java CalculadoraDeITBI
```

### 3. Sistema de Avaliação
Descrição: Recebe as notas de duas provas e de um trabalho através do JOptionPane. O sistema calcula a média aritmética simples do aluno e exibe a média final junto com a sua situação: "APROVADO" (média >= 6) ou "REPROVADO".

**Como executar:**
```
javac SistemaDeAvaliacao.java
java SistemaDeAvaliacao
```

### 4. Calculadora de Aposentadoria
Descrição: O programa recebe a idade, o sexo (M ou F) e os anos de contribuição de uma pessoa. Com base em regras simplificadas de aposentadoria (por idade ou tempo de contribuição), ele determina se a pessoa já pode se aposentar ou informa quantos anos faltam para cada modalidade.

**Como executar:**
```
javac CalculadoraDeAposentadoria.java
java CalculadoraDeAposentadoria
```

### 5. Circuito de Resistências
Descrição: Solicita ao usuário o valor de quatro resistências que estão ligadas em série. O programa calcula e exibe a resistência equivalente do circuito (que é a soma de todas as resistências), além de identificar e mostrar qual foi a maior e a menor resistência informada.

**Como executar:**
```
javac CircuitoDeResistencias.java
java CircuitoDeResistencias
```

### 6. Sistema de Login
Descrição: Simula uma tela de acesso a um sistema. O usuário deve informar um login e uma senha. Os dados são comparados com os valores pré-definidos ("java8"). O sistema concede um total de três tentativas. Caso o usuário erre todas, o acesso é bloqueado; caso acerte, uma mensagem de boas-vindas é exibida.

**Como executar:**
```
javac SistemaDeLogin.java
java SistemaDeLogin
```

### 7. Gerador de Tabuada
Descrição: O programa pede que o usuário digite um número inteiro. Em seguida, utilizando um laço de repetição, ele gera e exibe a tabuada de multiplicação completa deste número, do 1 ao 10.

**Como executar:**
```
javac GeradorDeTabuada.java
java GeradorDeTabuada
```