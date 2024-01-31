import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void adicionarEObterTotal() {
        Cliente cliente = new Cliente("Maromo");
        Pedido pedido = new Pedido(cliente);

        Item item1 = new Item("Produto1", 10.0);
        Item item2 = new Item("Produto2", 15.0);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        assertEquals(25.0, pedido.getTotal(), 0.01);
    }
}
