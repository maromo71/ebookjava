public class Pilha<T> {
    private java.util.LinkedList<T> elementos = new java.util.LinkedList<>();

    public void push(T elemento) {
        elementos.addFirst(elemento);
    }

    public T pop() {
        return elementos.removeFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        // Teste com Integer
        Pilha<Integer> pilhaInt = new Pilha<>();
        pilhaInt.push(1);
        pilhaInt.push(2);
        System.out.println(pilhaInt.pop()); // Saída: 2
        System.out.println(pilhaInt.pop()); // Saída: 1

        // Teste com String
        Pilha<String> pilhaString = new Pilha<>();
        pilhaString.push("Java");
        pilhaString.push("Generics");
        System.out.println(pilhaString.pop()); // Saída: Generics
        System.out.println(pilhaString.pop()); // Saída: Java
    }
}
