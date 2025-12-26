public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirInformacoes() {
        System.out.printf("Produto: %s \nPreco: R$ %.2f\nQuantidade em estoque: %d", nome, preco, quantidade);
    }
}
