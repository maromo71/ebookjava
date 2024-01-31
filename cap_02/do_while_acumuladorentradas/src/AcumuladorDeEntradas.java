import java.util.Scanner;

public class AcumuladorDeEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);
        scanner.close();
    }
}
