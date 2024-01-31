import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + ": " + idade;
    }
}

public class  LambdaSortingDemo{
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Ana", 25), new Pessoa("João", 20), new Pessoa("Clara", 23));
        pessoas.sort(Comparator.comparing(p -> p.nome));
        System.out.println(pessoas);
    }
}
