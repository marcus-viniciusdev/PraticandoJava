public class Main {
    public static void main(String[] args) {
        int inicio = 1;
        int fim = 50;

        int somaDosPares = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                somaDosPares += i;
            }
        }

        System.out.println("A soma dos números pares de " + inicio + " a " + fim + " é: " + somaDosPares);
    }
}
