public class Main {
    public static void main(String[] args) {
        double preco = 150.0;
        String categoria;

        if (preco <= 50) {
            categoria = "Econômico";
        } else if (preco <= 200) {
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}
