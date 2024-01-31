import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Estudante {
    String nome;
    double nota;

    Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + ": " + nota;
    }
}

public class OrdenarEstudantes {
    public static void main(String[] args) {
        List<Estudante> estudantes = Arrays.asList(
                new Estudante("Alice", 82.5),
                new Estudante("Bob", 90.0),
                new Estudante("Clara", 88.2)
        );

        estudantes.sort(Comparator.comparingDouble((Estudante e) -> e.nota).reversed());

        for (Estudante e : estudantes) {
            System.out.println(e);
        }
    }
}

