import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.now();
        int mesesAdiantados = 1;
        LocalDate dataAdiada = dataVencimento.plusMonths(mesesAdiantados);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataAdiada.format(formatoData);

        System.out.println("Nova data de vencimento: " +dataFormatada);
    }
}
