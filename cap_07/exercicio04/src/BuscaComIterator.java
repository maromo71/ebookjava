import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BuscaComIterator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(30, 40, 55, 60, 70);

        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero > 50) {
                System.out.println("Primeiro número maior que 50: " + numero);
                break;
            }
        }
    }
}
