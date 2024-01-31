// Interfaces
interface Andador {
    void andar();
}

interface Falador {
    void falar();
}

interface Trabalhador {
    void trabalhar();
}

// Classe Robo implementando todas as interfaces
class Robo implements Andador, Falador, Trabalhador {
    @Override
    public void andar() {
        System.out.println("Robô andando");
    }

    @Override
    public void falar() {
        System.out.println("Robô falando");
    }

    @Override
    public void trabalhar() {
        System.out.println("Robô trabalhando");
    }
}

// Classe para testar o Robô
public class TesteRobo {
    public static void main(String[] args) {
        Robo robo = new Robo();
        robo.andar();
        robo.falar();
        robo.trabalhar();
    }
}
