public interface Pagavel {
    void realizarPagamento();
}

class Fatura implements Pagavel {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento da fatura realizado.");
    }
}

class Emprestimo implements Pagavel {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento do empréstimo realizado.");
    }
}

