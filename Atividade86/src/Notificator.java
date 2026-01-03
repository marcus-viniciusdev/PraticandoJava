public class Notificator {
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Mensagem para " + destinatario + ": " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem, int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println("Mensagem para " + destinatario + ": " + mensagem);
        }
    }
}
