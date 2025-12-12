import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra > 100) {
            double desconto = valorCompra * 0.1;
            System.out.println("Desconto de 10% aplicado.");
            double valorComDesconto = valorCompra - desconto;
            System.out.println("Novo valor: R$ " + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valorCompra);
        }
    }
}
