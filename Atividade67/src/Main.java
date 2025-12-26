import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(t1);
        tarefas.add(t2);

        tarefas.forEach(Tarefa::exibirInformacoes);
    }
}
