# Explicações dos Exercícios Práticos de Java

Este documento fornece um detalhamento das soluções para dois exercícios práticos de Java, abordando TDD (Test Driven Development) e testes unitários.

## 1. TDD para Adicionar uma Nova Funcionalidade

### Objetivo
Praticar TDD do início ao fim para adicionar um novo método `subtrair` à classe `Calculadora`.

### Teste da Classe `Calculadora`

- Criamos um teste unitário usando JUnit para o método `subtrair`.
- O teste verifica se a subtração de dois números (5 e 3) resulta em 2.
- A assertiva `assertEquals` é utilizada para garantir que o resultado da subtração seja como esperado.

### Implementação da Classe `Calculadora`

- A classe `Calculadora` inclui o método `subtrair`, que aceita dois inteiros como argumentos e retorna a diferença entre eles.
- Esta implementação é a resposta direta ao teste escrito anteriormente, garantindo que ele passe.

## 2. Testes Unitários para um Sistema de Pedidos

### Objetivo
Escrever testes unitários para um sistema que inclui as classes `Pedido`, `Item` e `Cliente`, testando funções como adicionar itens ao pedido e calcular o total.

### Teste da Classe `Pedido`

- O teste `adicionarEObterTotal` verifica a funcionalidade de adicionar itens a um pedido e calcular o total.
- Duas instâncias da classe `Item` são criadas e adicionadas ao `Pedido`.
- O teste assegura que o total calculado, obtido pelo método `getTotal`, seja a soma dos preços dos itens.

### Implementação das Classes do Sistema de Pedidos

#### Classe `Cliente`
- Representa um cliente com um atributo `nomeCliente`.
- Inclui um construtor e um método para obter o nome do cliente.

#### Classe `Item`
- Define um item com atributos `descricao` e `preco`.
- Possui um construtor e métodos para obter a descrição e o preço do item.

#### Classe `Pedido`
- Mantém uma lista de itens (`itensPedido`) e um cliente (`clientePedido`).
- Inclui um método para adicionar itens ao pedido e um para calcular o total do pedido.
- O total é calculado somando os preços de todos os itens na lista.

---

Estas soluções demonstram a aplicação de TDD e testes unitários em Java, fornecendo um exemplo prático de como essas técnicas são implementadas em cenários reais de desenvolvimento de software.
