public class Conta {
    private final String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            this.saldo += quantia;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double quantia) {
        if (saldo >= quantia) {
            saldo -= quantia;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f", titular, saldo);
    }
}
