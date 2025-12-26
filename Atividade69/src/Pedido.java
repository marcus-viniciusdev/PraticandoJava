public class Pedido {
    String titulo;
    int diasAtraso;

    public double calculaMulta() {
        return 2.50 * diasAtraso;
    }

    public void exibirDetalhes() {
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, diasAtraso, calculaMulta());
    }
}
