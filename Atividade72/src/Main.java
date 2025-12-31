import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        int i = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s%n", i, contato.getNome(), contato.getTelefone());
            i++;
        }
    }
}
