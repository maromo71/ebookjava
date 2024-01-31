public abstract class InstrumentoMusical {
    public abstract void tocar();
}

class Piano extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando piano.");
    }
}

class Violao extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando violão.");
    }
}

