public class Tarefa {
    String descricao;
    boolean concluida;

    public void exibirInformacoes() {
        String status;

        if (concluida) {
            status = "Concluída";
        } else {
            status = "Pendente";
        }

        System.out.println("Tarefa: " + descricao + " - Status: " + status);
    }
}
