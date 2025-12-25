import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        Double totalGasto = precosProdutos.stream().reduce(0.0, Double::sum);

        Double imposto = totalGasto * 0.08;
        Double totalGastoComImposto = totalGasto + imposto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", totalGasto));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalGastoComImposto));
    }
}
