public class Main {
    public static void main(String[] args) {
        Notificator notificacao = new Notificator();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
