import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainedOperationsDemo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("maçã", "morcego", "gato", "ferramenta");
        List<String> resultado = palavras.stream()
                .filter(p -> p.length() >= 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
