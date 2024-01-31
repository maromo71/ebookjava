// Interface InstrumentoMusical
interface InstrumentoMusical {
    void tocar();
    void afinar();
}

// Classe Guitarra implementando InstrumentoMusical
class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando guitarra");
    }
}

// Classe Piano implementando InstrumentoMusical
class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando piano");
    }
}

// Classe para testar as implementações
public class TesteInstrumentos {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();

        guitarra.tocar();
        guitarra.afinar();

        piano.tocar();
        piano.afinar();
    }
}
