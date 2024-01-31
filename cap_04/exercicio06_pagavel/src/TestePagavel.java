public class TestePagavel {
    public static void main(String[] args) {
        Pagavel fatura = new Fatura();
        Pagavel emprestimo = new Emprestimo();

        fatura.realizarPagamento();
        emprestimo.realizarPagamento();
    }
}
