import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario login = new Usuario("aluno2025", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = scanner.next();

            System.out.print("Digite a sua senha: ");
            String senha = scanner.next();
            if (login.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("Acesso bloqueado!");
                }
            }
        }
        scanner.close();
    }
}
