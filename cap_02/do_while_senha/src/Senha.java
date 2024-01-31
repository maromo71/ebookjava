import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "12345";
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
        } while (!senha.equals(SENHA_CORRETA));

        System.out.println("Acesso concedido!");
        scanner.close();
    }
}
