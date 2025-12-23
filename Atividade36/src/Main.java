import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        Double valor = scanner.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f", valor);
        scanner.close();
    }
}
