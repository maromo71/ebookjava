public interface Navegavel {
    void navegar();
}

class Barco implements Navegavel {
    @Override
    public void navegar() {
        System.out.println("Navegando com o barco.");
    }
}

class Submarino implements Navegavel {
    @Override
    public void navegar() {
        System.out.println("Navegando com o submarino.");
    }
}

