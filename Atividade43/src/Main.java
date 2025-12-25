import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(4, 0);
        LocalTime fim = LocalTime.of(6, 15);
        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutes() + " minutos");
    }
}
