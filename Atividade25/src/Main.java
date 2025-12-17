import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String[] numerosStr = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numeroStr : numerosStr) {
            int numero = Integer.parseInt(numeroStr);
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
