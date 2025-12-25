import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        double soma = notas.stream().reduce(0.0, Double::sum);
        double media = soma / notas.size();

        System.out.println("A média das notas é: " + media);

        Optional<Double> menorNota = notas.stream().min(Double::compare);
        Optional<Double> maiorNota = notas.stream().max(Double::compare);
        if (menorNota.isPresent() && maiorNota.isPresent()) {
            System.out.println("A menor nota foi: " + menorNota.get());
            System.out.println("A maior nota foi: " + maiorNota.get());
        }
    }
}
