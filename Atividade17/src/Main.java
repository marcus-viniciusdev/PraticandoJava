import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        int valorParaEmprestimo = scanner.nextInt();
        scanner.close();

        if (valorParaEmprestimo >= 1000 && valorParaEmprestimo <= 5000) {
            System.out.println("O valor " + valorParaEmprestimo + ", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valorParaEmprestimo + ", não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
