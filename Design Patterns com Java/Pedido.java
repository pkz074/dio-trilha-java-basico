import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    private PagamentoStrategy estrategiaPagamento;

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(item -> item.getPreco()).sum();
    }

    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void pagar() {
        double total = calcularTotal();
        estrategiaPagamento.pagar(total);
    }

    @Override
    public String toString() {
        return "Pedido: " + itens;
    }
}
