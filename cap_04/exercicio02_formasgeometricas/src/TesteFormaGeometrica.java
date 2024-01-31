public class TesteFormaGeometrica {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(10, 20);
        FormaGeometrica triangulo = new Triangulo(10, 5);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}

