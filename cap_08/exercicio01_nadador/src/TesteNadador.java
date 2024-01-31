// Interface Nadador com método default
interface Nadador {
    default void nadar() {
        System.out.println("Nadando em estilo padrão");
    }
}

// Classe Peixe implementando a interface Nadador
class Peixe implements Nadador {
    @Override
    public void nadar() {
        System.out.println("Nadando rapidamente");
    }
}

// Classe para testar a implementação
public class TesteNadador {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        peixe.nadar();
    }
}
