import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> quadros = numeros.stream().map(n -> n * n).toList();
        System.out.println("Quadrados dos números: " + quadros);
    }
}
