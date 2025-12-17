import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int quantidadeDegras = scanner.nextInt();

        for (int i = 1; i <= quantidadeDegras; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
        scanner.close();
    }
}
