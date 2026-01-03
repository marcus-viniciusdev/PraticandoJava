public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void confirmarPagamento() {
    }

    public double calcularTaxa(double juros) {
        return valor * juros;
    }
}
