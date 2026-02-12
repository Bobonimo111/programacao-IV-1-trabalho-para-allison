package Application.messages;

public class MensagemEmail implements  Mensagem {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando mensagem de email...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Email enviado com sucesso!");
    }
}
