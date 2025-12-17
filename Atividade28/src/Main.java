import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroStr;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        do {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            numeroStr = scanner.next();
            if (!numeroStr.equalsIgnoreCase("fim")) {
                int numero = Integer.parseInt(numeroStr);
                if (numero > 0) {
                    qtdPositivos++;
                } else if (numero < 0) {
                    qtdNegativos++;
                }
            }
        } while (!numeroStr.equalsIgnoreCase("fim"));
        System.out.println("Números positivos: " + qtdPositivos);
        System.out.println("Números negativos: " + qtdNegativos);

        scanner.close();
    }
}
