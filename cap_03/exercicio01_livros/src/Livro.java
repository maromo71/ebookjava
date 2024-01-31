public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        meuLivro.exibirDetalhes();
    }
}
