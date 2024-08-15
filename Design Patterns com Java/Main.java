public class Main {
    public static void main(String[] args) throws Exception {
        
        PedidoManager pedidoManager = PedidoManager.getInstance();

        Prato pizza = PratoFactory.criarPrato("pizza");
        Bebida refrigerante = new Bebida("Refrigerante", 5.00);
        Pedido pedido1 = new Pedido();

        pedido1.adicionarItem(pizza);
        pedido1.adicionarItem(refrigerante);
        pedido1.setEstrategiaPagamento(new PagamentoCartao());
        pedido1.pagar();

        pedidoManager.adicionarPedido(pedido1);

        System.out.println(pedido1);
    }
}