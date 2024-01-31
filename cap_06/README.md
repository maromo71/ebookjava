# Explicações dos Exercícios de Java

Este documento fornece detalhes sobre seis exercícios de Java, abordando conceitos como deadlock, tratamento de exceções e exceções personalizadas.

## 1. Simulação de Deadlock (`DeadlockDemo.java`)

```java
public class DeadlockDemo {
    public static void main(String[] args) {
        final String recurso1 = "Recurso 1";
        final String recurso2 = "Recurso 2";

        Thread thread1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 1: bloqueou recurso 1");
                try { Thread.sleep(100);} catch (Exception e) {}
                synchronized (recurso2) {
                    System.out.println("Thread 1: bloqueou recurso 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (recurso2) {
                System.out.println("Thread 2: bloqueou recurso 2");
                try { Thread.sleep(100);} catch (Exception e) {}
                synchronized (recurso1) {
                    System.out.println("Thread 2: bloqueou recurso 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
```

Este código demonstra um cenário de deadlock, onde duas threads tentam adquirir bloqueios em dois recursos, mas em ordens inversas, criando uma condição de espera circular.

## 2. Solução de Deadlock (DeadlockResolvedDemo.java)

```java
public class DeadlockResolvedDemo {
    public static void main(String[] args) {
        final String recurso1 = "Recurso 1";
        final String recurso2 = "Recurso 2";

        Thread thread1 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 1: bloqueou recurso 1");
                try { Thread.sleep(100);} catch (Exception e) {}
                synchronized (recurso2) {
                    System.out.println("Thread 1: bloqueou recurso 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (recurso1) {
                System.out.println("Thread 2: bloqueou recurso 1");
                try { Thread.sleep(100);} catch (Exception e) {}
                synchronized (recurso2) {
                    System.out.println("Thread 2: bloqueou recurso 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
```
Nesta versão, as threads são alteradas para adquirir bloqueios na mesma ordem, resolvendo o problema de deadlock.

## 3. Tratamento Básico de Exceções (ExceptionHandlingDemo.java)

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        } finally {
            scanner.close();
            System.out.println("Operação finalizada.");
        }
    }
}
```

Este programa demonstra como tratar duas exceções comuns: `ArithmeticException` para divisão por zero e 
`InputMismatchException` para entradas inválidas.

## 4. Lançamento de Exceções Personalizadas (`ValidadorIdade.java`)

```java
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class ValidadorIdade {
    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18 || idade > 100) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }

    public static void main(String[] args) {
        try {
            verificarIdade(17);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
Este exemplo ilustra a criação e o uso de uma exceção personalizada, `IdadeInvalidaException`. 
O método `verificarIdade` lança esta exceção se a idade fornecida estiver fora do intervalo especificado (menor que 18 ou maior que 100).

## 5. Uso de Blocos finally (ArquivoLeituraDemo.java)

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoLeituraDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("exemplo.txt"));
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo: " + ex.getMessage());
            }
        }
    }
}
```

Este código demonstra a abertura e leitura de um arquivo usando `FileReader` e `BufferedReader`. O bloco `finally é usado para garantir que o arquivo seja fechado corretamente, independentemente de uma exceção ocorrer ou não.

## 6. Propagação de Exceções (ExcecaoPropagacaoDemo.java)
```java
public class ExcecaoPropagacaoDemo {
    public static void metodoA() throws ArithmeticException {
        System.out.println("Iniciando método A");
        metodoB();
        System.out.println("Finalizando método A");
    }

    public static void metodoB() throws ArithmeticException {
        System.out.println("Iniciando método B");
        int resultado = 1 / 0; // Isso vai gerar uma ArithmeticException
        System.out.println("Finalizando método B");
    }

    public static void main(String[] args) {
        try {
            metodoA();
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada no main: " + e.getMessage());
        }
    }
}
```

Neste exemplo, o método `metodoB` gera uma `ArithmeticException` que é propagada para `metodoA` e, em seguida, capturada e tratada no método `main`. Isso demonstra como as exceções podem ser propagadas através de chamadas de métodos.


Estas explicações cobrem os exercícios de 4 a 6, continuando o estilo e formato do arquivo `Readme.md` que você está criando.
