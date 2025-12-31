import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private final String nome;
    private final List<Double> notasAlunos;

    public Disciplina(String nome) {
        this.nome = nome;
        notasAlunos = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notasAlunos.add(nota);
        } else {
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    public int getQtdNotas() {
        return notasAlunos.size();
    }

    public double calcularMedia() {
        if (notasAlunos.isEmpty()) return 0;

        double soma = 0;
        for (double nota : notasAlunos) {
            soma += nota;
        }
        return soma / notasAlunos.size();
    }

    public String getNome() {
        return nome;
    }
}
