public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public void exibirResultado() {
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.1f%n", media);
        String situacao;
        if (media >= 7) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.println("Situação: " + situacao);
    }
}
