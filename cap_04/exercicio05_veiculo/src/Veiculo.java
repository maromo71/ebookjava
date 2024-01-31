public abstract class Veiculo {
    public abstract void acelerar();
    public abstract void frear();
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando.");
    }
}

class Bicicleta extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando.");
    }
}
