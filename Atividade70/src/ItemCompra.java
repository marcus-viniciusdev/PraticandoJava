public class ItemCompra {
    String nome;
    double preco;
    int quantidade;

    public double totalGastoItem() {
        return preco * quantidade;
    }
}
