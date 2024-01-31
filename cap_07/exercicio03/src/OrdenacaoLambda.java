import java.util.Arrays;
import java.util.List;

public class OrdenacaoLambda {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Lambda", "Exemplo", "Lista", "Java");
        palavras.sort((s1, s2) -> s1.length() - s2.length());

        for (String s : palavras) {
            System.out.println(s);
        }
    }
}

