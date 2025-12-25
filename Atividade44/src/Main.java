import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        long prazoEmDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoEmDias);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formatoData);

        System.out.println("Data de entrega: " + dataFormatada);
    }
}
