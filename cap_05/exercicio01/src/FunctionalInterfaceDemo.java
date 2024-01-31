@FunctionalInterface
interface VerificarNumero {
    boolean verificar(int numero);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        VerificarNumero ehPar = (n) -> n % 2 == 0;
        System.out.println("O número 4 é par? " + ehPar.verificar(4));
    }
}

