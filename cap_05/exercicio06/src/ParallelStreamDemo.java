import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> listaGrande = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            listaGrande.add(i);
        }

        long soma = listaGrande.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Soma: " + soma);
    }
}
