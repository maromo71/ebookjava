import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itensPedido = new ArrayList<Item>();
    private Cliente clientePedido;

    public Pedido(Cliente clientePedido){

        this.clientePedido = clientePedido;
    }

    public void adicionarItem(Item item){
        itensPedido.add(item);
    }

    public double getTotal(){
        double total = 0.0;
        for (Item i: itensPedido) {
            total+=i.getPreco();
        }
        return total;
    }
}
