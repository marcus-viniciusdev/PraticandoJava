import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        scanner.close();

        boolean idadeValidacao = idade >= 18 && idade <= 65;
        boolean pesoValidacao = peso > 50;

        if (idadeValidacao && pesoValidacao) {
            System.out.println("O doador é compatível.");
        } else {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: ");

            if (!idadeValidacao) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValidacao) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
        }
    }
}
