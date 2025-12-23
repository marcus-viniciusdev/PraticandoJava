import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String arquivoNome = scanner.nextLine();

        int posicaoPonto = arquivoNome.lastIndexOf('.');

        if (posicaoPonto != -1) {
            String arquivoSemExtensao = arquivoNome.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + arquivoSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }
        scanner.close();
    }
}
