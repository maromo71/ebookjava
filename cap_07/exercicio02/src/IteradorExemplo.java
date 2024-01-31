import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteradorExemplo {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Olá", "remover", "Mundo", "remover"));

        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equals("remover")) {
                iterador.remove();
            }
        }

        System.out.println(lista);
    }
}
