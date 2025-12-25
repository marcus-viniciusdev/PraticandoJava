import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> nomesFiltrados = funcionarios.stream().filter(f -> f.length() <= 5).toList();

        System.out.println(nomesFiltrados);
    }
}
