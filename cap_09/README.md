# Explicações dos Exercícios de Java

Este documento detalha três exercícios de Java, cada um explorando diferentes funcionalidades da linguagem.

## 1. Generics: Criação de uma Classe Genérica (`Pilha<T>`)

- **Objetivo**: Praticar a implementação e uso de classes genéricas em Java.
- **Descrição**:
    - Desenvolvemos uma classe genérica `Pilha<T>`, que permite armazenar elementos de qualquer tipo.
    - Implementamos métodos para adicionar (`push`) e remover (`pop`) elementos, além de verificar se a pilha está vazia (`isEmpty`).
    - Testamos a classe `Pilha` com tipos diferentes, como `Integer` e `String`, demonstrando a flexibilidade e reutilização do código proporcionada pelas classes genéricas.

## 2. Annotations: Desenvolvimento de uma Annotation Personalizada (`@LogMetodo`)

- **Objetivo**: Praticar a criação e aplicação de annotations personalizadas.
- **Descrição**:
    - Criamos uma annotation personalizada `@LogMetodo`, que pode ser aplicada a métodos.
    - Quando um método anotado é chamado, uma mensagem de log indicando a execução do método é impressa.
    - Usamos reflexão para identificar e invocar métodos anotados com `@LogMetodo` na classe `ExemploComAnnotation`, demonstrando a utilidade das annotations para adicionar metadados e comportamentos específicos aos métodos.

## 3. Reflexão: Modificação de Campos Privados

- **Objetivo**: Explorar o uso de reflexão para acessar e modificar campos privados.
- **Descrição**:
    - Criamos uma classe com um campo privado `senha`.
    - Utilizamos a reflexão para modificar o valor desse campo privado em uma instância da classe, mesmo sem ter acesso direto ao campo.
    - Através do uso de reflexão, acessamos o campo `senha`, alteramos seu valor e verificamos o resultado, ilustrando como a reflexão pode ser usada para interagir com componentes internos de objetos de maneira avançada e flexível.
