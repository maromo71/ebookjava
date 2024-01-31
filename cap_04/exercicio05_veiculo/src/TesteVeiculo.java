public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.acelerar();
        carro.frear();

        bicicleta.acelerar();
        bicicleta.frear();
    }
}
