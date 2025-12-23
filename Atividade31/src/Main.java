import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine().trim();

        System.out.println("Nome sem espaços: " + nome);
        scanner.close();
    }
}
