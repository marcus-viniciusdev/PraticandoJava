import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        int totalTentativas = 3;
        String senha = "";

        for (int t = totalTentativas; t > 0; t--) {
            System.out.print("Digite sua senha: ");
            senha = scanner.next();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (t > 1) {
                System.out.println("Senha incorreta. Você tem " + (t - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
        scanner.close();
    }
}
