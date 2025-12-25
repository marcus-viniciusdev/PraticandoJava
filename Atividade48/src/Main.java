import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime horaAtualToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaAtualToquioFormatada = horaAtualToquio.format(formatoData);

        System.out.println("Horário atual em Tóquio: " + horaAtualToquioFormatada);
    }
}
