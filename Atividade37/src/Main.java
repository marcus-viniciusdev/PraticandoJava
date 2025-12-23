import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código de referência: ");
        String codigo = scanner.nextLine();

        Pattern formatoCodigo = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = formatoCodigo.matcher(codigo);
        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência não está válido.");
        }

        scanner.close();
    }
}
