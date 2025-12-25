import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Dani");
        clientes.put(2, "Marcus");
        clientes.put(3, "Danilli");

        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
    }
}
