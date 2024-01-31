public class Contador {
    public static void contagemRegressiva(int numero) {
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Contador.contagemRegressiva(10);
    }
}
