# Explicações dos Exercícios de Java

Este documento detalha três exercícios de Java, focando em interfaces, métodos default, e implementação de múltiplas interfaces.

## 1. Implementação de Interface com Método Default

- **Objetivo**: Praticar a criação de interfaces com métodos default e entender como eles podem ser sobrescritos em classes que implementam a interface.
- **Descrição**:
    - Criamos uma interface chamada `Nadador` que possui um método default `nadar`, imprimindo uma mensagem padrão sobre natação.
    - A classe `Peixe` implementa a interface `Nadador`. Dentro da classe `Peixe`, sobrescrevemos o método `nadar` com uma mensagem específica, indicando um estilo de natação diferente.
    - Este exercício ilustra como métodos default em interfaces permitem fornecer implementações que podem ser usadas ou sobrescritas por classes implementadoras.

## 2. Interface com Múltiplos Métodos

- **Objetivo**: Aprofundar o entendimento sobre interfaces no Java, implementando múltiplos métodos definidos por uma interface em classes distintas.
- **Descrição**:
    - Desenvolvemos uma interface `InstrumentoMusical` que define dois métodos: `tocar` e `afinar`.
    - Implementamos esta interface em duas classes diferentes: `Guitarra` e `Piano`. Cada uma dessas classes fornece sua própria implementação concreta para os métodos `tocar` e `afinar`.
    - Este exercício mostra como uma única interface pode ser usada para impor um contrato em várias classes, garantindo que todas as classes implementadoras forneçam funcionalidades específicas.

## 3. Interfaces para Funcionalidades de um Robô

- **Objetivo**: Explorar a implementação de múltiplas interfaces em uma única classe, proporcionando funcionalidades variadas.
- **Descrição**:
    - Definimos três interfaces: `Andador`, `Falador` e `Trabalhador`. Cada interface contém métodos relacionados a sua funcionalidade específica, como `andar`, `falar` e `trabalhar`.
    - Criamos uma classe `Robo` que implementa todas essas três interfaces. Na classe `Robo`, fornecemos implementações concretas para todos os métodos definidos pelas interfaces.
    - Este exercício destaca como uma classe em Java pode implementar várias interfaces, cada uma representando uma funcionalidade distinta, demonstrando a flexibilidade e a reutilização de código.
