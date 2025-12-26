public class Item {
    String nome;
    int quantidade;

    public void vender(int qtdVendas) {
        if (quantidade >= qtdVendas) {
            quantidade -= qtdVendas;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
