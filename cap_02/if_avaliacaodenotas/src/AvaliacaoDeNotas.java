import java.util.Scanner;

public class AvaliacaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (0 a 100): ");
        int nota = scanner.nextInt();

        // Verifica se a nota é maior ou igual a 60
        if (nota >= 60) {
            System.out.println("Aluno passou.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
