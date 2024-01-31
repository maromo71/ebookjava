## Classe Scanner
Antes de iniciarmos a resolução dos exercícios, é importante compreender a classe Scanner e sua relevância neste contexto. A classe Scanner é uma ferramenta essencial em Java para a leitura e interpretação de dados de entrada, seja de um usuário através do teclado ou de outras fontes, como arquivos. Vamos utilizá-la nos exercícios para permitir interações dinâmicas, onde os dados fornecidos pelo usuário influenciarão diretamente na execução e nos resultados do programa. Esse entendimento prático da classe Scanner não só facilitará a resolução dos exercícios propostos, mas também fornecerá uma base sólida para futuras aplicações em situações reais de programação.

A classe Scanner é uma parte do pacote java.util e é uma das maneiras mais comuns de ler entrada de dados do usuário em Java. Ela é usada para interpretar e converter texto em tipos de dados primitivos (como int, double, String, etc.) de várias fontes, como entrada do teclado, arquivos, e streams.

### Características Principais
* **Flexibilidade:** A classe Scanner pode ler e analisar texto de várias fontes, incluindo strings, arquivos e streams.
* **Conversão Fácil:** Converte automaticamente texto em vários tipos primitivos, como int, double, float, long, short, byte e boolean.
* **Uso de Delimitadores:** Por padrão, a classe Scanner usa espaços em branco como delimitadores para separar elementos de entrada. Esses delimitadores podem ser personalizados.
* **Leitura de Strings:** Pode ler uma linha inteira de texto ou apenas a próxima palavra (texto até o próximo delimitador).

### Como Usar a Classe Scanner
Para usar a classe Scanner, você primeiro precisa importá-la no início do seu código:

`import java.util.Scanner;`

Depois, você cria um objeto Scanner, geralmente usando System.in para ler do teclado:

`Scanner scanner = new Scanner(System.in);`

Aqui, System.in é um InputStream que está conectado à entrada padrão do seu programa (geralmente o teclado).

### Exemplos de Métodos Comuns
* **nextInt():** Lê o próximo inteiro da entrada.
* **nextDouble():** Lê o próximo número de ponto flutuante (double) da entrada.
* **nextLine():** Lê a próxima linha de texto.
* **next():** Lê a próxima palavra (texto até o próximo espaço em branco).

### Exemplo de Código

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

System.out.println("Nome: " + nome + ", Idade: " + idade);
```


Neste exemplo, o programa pede ao usuário que digite seu nome e idade. Primeiro, ele usa nextLine() para ler uma linha inteira de texto (o nome). Depois, usa nextInt() para ler um número inteiro (a idade).

### Fechando o Scanner
É uma boa prática fechar o scanner quando ele não é mais necessário, para liberar os recursos que ele pode estar segurando. Isso é feito usando o método close():

```java
scanner.close();
```
## Considerações Finais
Lembre-se de tratar exceções de entrada, como InputMismatchException, que pode ocorrer se o usuário digitar um tipo de dado inesperado.
O uso do nextLine() após métodos como nextInt() pode levar a resultados inesperados devido ao modo como o Scanner lida com quebras de linha. Uma solução comum é chamar nextLine() duas vezes - a primeira para consumir a quebra de linha, e a segunda para ler a próxima linha de texto.