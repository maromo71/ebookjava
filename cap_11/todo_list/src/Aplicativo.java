
import java.io.IOException;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        System.out.println("Aplicativo de Lista de Tarefas");
        boolean executando = true;
        while (executando) {
            System.out.println("\nOpções: \n[1] Adicionar Tarefa" +
                    "\n[2] Concluir Tarefa\n[3] Listar Tarefas " +
                    "\n[4] Remover \n[5] Salvar Tarefas \n[6] Buscar Tarefas " +
                    "\n[7] Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da Tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.print("Índice da Tarefa a concluir: ");
                    int indice = scanner.nextInt();
                    gerenciador.concluirTarefa(indice);
                    break;
                case 3:
                    gerenciador.listarTarefas();
                    break;
                case 4:
                    System.out.print("Índice da Tarefa a remover: ");
                    int indiceRemover = scanner.nextInt();
                    gerenciador.removerTarefa(indiceRemover);
                    break;
                case 5:
                    gerenciador.salvarTarefas("tarefas.dat");
                    break;
                case 6:
                    gerenciador.carregarTarefas("tarefas.dat");
                    break;

                case 7:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
