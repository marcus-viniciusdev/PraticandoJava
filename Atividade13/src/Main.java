import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String senha = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.next();

        scanner.close();

        if (senhaDigitada.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
