import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> convidados = new ArrayList<>();
        String input;
        do {
            System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            if (!input.equalsIgnoreCase("sair")) {
                String finalInput = input;
                if (convidados.stream().anyMatch(c -> c.equalsIgnoreCase(finalInput))) {
                    System.out.println("O nome " + input+ " já está na lista de convidados.");
                } else {
                    convidados.add(input);
                    System.out.println(input + " foi adicionado à lista de convidados.");
                }
            }
        } while (!input.equalsIgnoreCase("sair"));
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
