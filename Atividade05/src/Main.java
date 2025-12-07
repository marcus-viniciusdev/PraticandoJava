public class Main {
    public static void main(String[] args) {
        String titulo = "The Lord of the Rings";
        String autor = "J.R.R Tolkien";
        int paginas = 321;
        double preco = 149.90;
        char categoria = 'F';

        String categoriaDescricao;

        switch (categoria) {
            case 'F' -> categoriaDescricao = "Ficção";
            case 'N' -> categoriaDescricao = "Não-ficção";
            case 'T' -> categoriaDescricao = "Tecnologia";
            case 'H' -> categoriaDescricao = "História";
            default -> categoriaDescricao = "Categoria inválida";
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");
    }
}
