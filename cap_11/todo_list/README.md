# Tarefa de Estender o Aplicativo
Para estender o aplicativo de lista de tarefas com as funcionalidades de remoção de tarefas e persistência de dados em arquivo, você precisará modificar as classes existentes e possivelmente adicionar novas. Vamos abordar cada uma dessas funcionalidades separadamente.

## 1. Adicionar Funcionalidade de Remoção de Tarefas
   Para adicionar a funcionalidade de remoção de tarefas, você pode incluir um novo método na classe GerenciadorDeTarefas e uma nova opção no menu do aplicativo.

### Modificação na Classe GerenciadorDeTarefas

#### Adicione um método removerTarefa:

```java
public void removerTarefa(int indice) {
if (indice >= 0 && indice < tarefas.size()) {
tarefas.remove(indice);
}
}
```

#### Modificação na Classe Aplicativo

Adicione uma nova opção no menu para remover tarefas:

```java
case 4:
System.out.print("Índice da Tarefa a remover: ");
int indiceRemover = scanner.nextInt();
gerenciador.removerTarefa(indiceRemover);
break;
```

E atualize a exibição das opções do menu:

```java
System.out.println("\nOpções: \n[1] Adicionar Tarefa" +
     "\n[2] Concluir Tarefa\n[3] Listar Tarefas " +
     "\n[4] Remover \n[5] Salvar Tarefas \n[6] Buscar Tarefas " +
     "\n[7] Sair");
```

## 2. Persistência de Dados em Arquivo
   Para salvar e carregar tarefas de um arquivo, você precisa de métodos para escrever e ler dados em um arquivo.

#### Adicionar Métodos de Leitura e Escrita no GerenciadorDeTarefas

```java
import java.io.*;

public void salvarTarefas(String arquivo) throws IOException {
   try (ObjectOutputStream out = new 
        ObjectOutputStream(new FileOutputStream(arquivo))) {
        out.writeObject(tarefas);
    }
}
public void carregarTarefas(String arquivo) 
        throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
        tarefas = (List<Tarefa>) in.readObject();
    }
}
```

##### Modificar a Classe Tarefa para Implementar Serializable

Para que a classe Tarefa possa ser serializada, ela precisa implementar a interface Serializable.

```java
import java.io.Serializable;

public class Tarefa implements Serializable {
// Restante da classe...
}
```

#### Modificar a Classe Aplicativo para Usar os Novos Métodos

Adicione opções para salvar e carregar tarefas do arquivo no menu do aplicativo e chame os métodos correspondentes.

```java
case 5:
    gerenciador.salvarTarefas("tarefas.dat");
    break;
case 6:
    gerenciador.carregarTarefas("tarefas.dat");
    break;
    
    ...
```

E atualize a exibição das opções do menu.

### Nota
```textmate
É importante tratar exceções ao lidar com operações de E/S de arquivos.
Ao implementar a persistência de dados, considere o que acontece quando o arquivo não existe, está vazio ou contém dados corrompidos.
Com essas modificações, o aplicativo de lista de tarefas não apenas permite adicionar, concluir e listar tarefas, mas também remover tarefas e persistir os dados em um arquivo.
```
