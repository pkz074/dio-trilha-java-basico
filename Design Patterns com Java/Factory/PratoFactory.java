public class PratoFactory {
    public static Prato criarPrato(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pizza":
                return new Prato("Pizza", 35.00);
            case "hamburguer":
                return new Prato("Hambúrguer", 20.00);
            case "sushi":
                return new Prato("Sushi", 40.00);
            default:
                throw new IllegalArgumentException("Opção Inexistente");
        }
    }
}
