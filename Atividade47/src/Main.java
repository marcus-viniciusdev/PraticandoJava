import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2026, 1, 10);
        int prazoAntecedencia = 10;
        LocalDate dataLembrete = dataVencimento.minusDays(prazoAntecedencia);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataLembreteFormatada = dataLembrete.format(formatter);

        System.out.println("Data do lembrete: " + dataLembreteFormatada);
    }
}
