import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código de acesso: ");
        int codigoAcesso = scanner.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();

        boolean codigoValidacao = codigoAcesso == 2023;
        boolean permissaoValidacao = nivelPermissao >= 1 && nivelPermissao <= 3;

        if (codigoValidacao && permissaoValidacao) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado.");
            System.out.println("Motivo(s):");
            if (!codigoValidacao) {
                System.out.println("- Código de acesso inválido.");
            }
            if (!permissaoValidacao) {
                System.out.println("- O nível de permissão deve estar entre 1 e 3.");
            }
        }
    }
}
