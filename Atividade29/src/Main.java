import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 10 != 5) {
                System.out.print(i + " ");

            }
        }
        scanner.close();
    }
}
