import java.util.ArrayList;
import java.util.List;

public class Filme {
    String titulo;
    List<Integer> avaliacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 a 5.");
        }
    }

    public double calcularMedia() {
        int soma = 0;
        for (int avaliacao : avaliacoes) {
            soma += avaliacao;
        }
        return (double) soma / avaliacoes.size();
    }
}