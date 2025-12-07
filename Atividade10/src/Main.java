public class Main {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        String mensagem;

        if (autonomiaAtual >= distanciaViagem) {
            mensagem = "Você conseguirá completar a viagem sem precisar abastecer.";
        } else {
            mensagem = "Você não conseguirá completar a viagem sem precisar abastecer.";
        }

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");
        System.out.println(mensagem);
    }
}
