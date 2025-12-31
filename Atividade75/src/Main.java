public class Main {
    public static void main(String[] args) {
        Bateria b = new Bateria();
        b.setNivel(85);

        System.out.println("Status: " + b.exibirStatus());
    }
}
