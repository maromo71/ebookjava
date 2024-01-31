import java.util.Scanner;

public class SomaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int soma = 0;

        // Loop de 1 até o número fornecido para calcular a soma
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
    }
}
