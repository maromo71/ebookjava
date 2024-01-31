// Exceção personalizada
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class ValidadorIdade {
    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18 || idade > 100) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }

    public static void main(String[] args) {
        try {
            verificarIdade(17);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

