import java.util.Scanner;

public class EntradaPositiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println("Número positivo inserido: " + numero);
        scanner.close();
    }
}
