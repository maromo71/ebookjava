import java.lang.reflect.Field;

class Usuario {
    private String senha = "senha123";

    public String getSenha() {
        return senha;
    }
}

public class ReflexaoTeste {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        Field campoSenha = Usuario.class.getDeclaredField("senha");
        campoSenha.setAccessible(true);
        campoSenha.set(usuario, "novaSenha");

        System.out.println("Senha modificada: " + usuario.getSenha()); // Saída: novaSenha
    }
}
