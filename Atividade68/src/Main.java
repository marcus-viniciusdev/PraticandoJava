public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}
