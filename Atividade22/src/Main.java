public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 50, 60};
        int soma = 0;

        for (int valor : valores) {
            soma+=valor;
        }

        System.out.println("A soma total das receitas é: " + soma);
    }
}
