public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.nome = "Júlia Oliveira";
        colaborador.cargo = "Pessoa Desenvolvedora Júnior";
        colaborador.nivelAcesso = 1;

        colaborador.alterarCargoEAcesso("Pessoa Desenvolvedora Plena", 2);
    }
}
