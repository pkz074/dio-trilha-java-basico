import java.util.ArrayList;
import java.util.List;

public class PedidoManager {
    private static PedidoManager instanciaUnica;
    private List<Pedido> pedidos;

    private PedidoManager() {
        pedidos = new ArrayList<>();
    }

    public static PedidoManager getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new PedidoManager();
        }
        return instanciaUnica;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
