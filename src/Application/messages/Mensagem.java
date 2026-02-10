package Application.messages;


public interface Mensagem {
    /***
     *  @Param mensagem : é a mensagem a ser enviada
     * @Param destinario : é o destinario podendo ser
     * um numero, email ou qualquer outro meio de comunicação
     */
    void enviar(String mensagem,String destinatario);
}
