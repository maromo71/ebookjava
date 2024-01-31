# Explicações dos Exercícios de Java

Este documento detalha quatro exercícios de Java, cada um focando em um aspecto específico da linguagem.

## 1. Uso de Comparador Personalizado

- **Objetivo**: Criar um comparador personalizado para ordenar objetos de uma classe personalizada (`Estudante`) com base em um de seus atributos (nota).
- **Descrição**:
    - A classe `Estudante` contém atributos para `nome` e `nota`.
    - Implementamos um comparador usando `Comparator.comparingDouble` e o método `reversed()` para ordenar a lista de estudantes em ordem decrescente de notas.
    - O método `toString` na classe `Estudante` é sobrescrito para facilitar a impressão das informações dos estudantes.
    - A lista de estudantes é ordenada e exibida, demonstrando a eficácia do comparador personalizado.

## 2. Iteração com Iterator

- **Objetivo**: Utilizar um `Iterator` para modificar uma coleção enquanto a percorre.
- **Descrição**:
    - Criamos uma `ArrayList` de strings que contém várias palavras, incluindo a palavra "remover".
    - Utilizamos um `Iterator` para percorrer a lista. Durante a iteração, cada elemento é verificado.
    - Se o elemento contém a palavra "remover", ele é removido da lista usando o método `remove` do `Iterator`.
    - Esse processo demonstra como os iteradores podem ser usados para modificar coleções de forma segura durante a iteração.

## 3. Ordenação com Lambda

- **Objetivo**: Praticar a ordenação de coleções utilizando expressões lambda.
- **Descrição**:
    - Criamos uma lista de strings.
    - Utilizamos uma expressão lambda dentro do método `sort` da lista para ordenar as strings pelo comprimento, do menor para o maior.
    - A expressão lambda compara o comprimento de duas strings para determinar sua ordem.
    - Este exercício mostra como as expressões lambda podem ser usadas para criar comparadores simples e concisos.

## 4. Busca com Iterator

- **Objetivo**: Aplicar o conceito de iteração para buscar um elemento específico em uma coleção.
- **Descrição**:
    - Criamos uma lista de números inteiros.
    - Usamos um `Iterator` para percorrer a lista de números.
    - Durante a iteração, verificamos se o número atual é maior que 50.
    - Se encontramos um número que atende a essa condição, ele é impresso, e a iteração é interrompida.
    - Este exercício demonstra como iteradores podem ser usados para busca eficiente em coleções.

