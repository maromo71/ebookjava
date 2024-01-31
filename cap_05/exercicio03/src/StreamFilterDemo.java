import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamFilterDemo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("maçã", "morcego", "gato", "ferramenta");
        List<String> palavrasFiltradas = palavras.stream()
                .filter(p -> p.length() >= 4)
                .collect(Collectors.toList());
        System.out.println(palavrasFiltradas);
    }
}
