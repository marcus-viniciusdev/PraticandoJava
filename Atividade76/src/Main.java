public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(200.00);
        conta.exibirSaldo();
    }
}
