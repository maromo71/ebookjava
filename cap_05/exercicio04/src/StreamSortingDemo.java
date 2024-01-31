import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingDemo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 8, 2, 9);
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(numerosOrdenados);
    }
}
