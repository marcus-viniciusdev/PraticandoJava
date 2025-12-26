import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        ItemCompra i1 = new ItemCompra();
        i1.nome = "Teclado";
        i1.preco = 120.0;
        i1.quantidade = 1;

        ItemCompra i2 = new ItemCompra();
        i2.nome = "Mouse";
        i2.preco = 60.0;
        i2.quantidade = 2;

        List<ItemCompra> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);

        double totalCompra = 0;

        for (ItemCompra item : itens) {
            totalCompra += item.totalGastoItem();
        }

        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
    }
}
