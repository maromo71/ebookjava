public class ExcecaoPropagacaoDemo {
    public static void metodoA() throws ArithmeticException {
        System.out.println("Iniciando método A");
        metodoB();
        System.out.println("Finalizando método A");
    }

    public static void metodoB() throws ArithmeticException {
        System.out.println("Iniciando método B");
        int resultado = 1 / 0; // Isso vai gerar uma ArithmeticException
        System.out.println("Finalizando método B");
    }

    public static void main(String[] args) {
        try {
            metodoA();
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada no main: " + e.getMessage());
        }
    }
}

