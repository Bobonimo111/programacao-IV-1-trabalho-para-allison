package Application;

import Application.Pagamentos.PagamentoService;
import Application.entity.PedidosEntity;
import Application.estoque.EstoqueService;
import Application.messages.Mensagem;
import Application.messages.MensagemEmail;

import java.util.List;

class OrderService {
    public void ProcessOrder(String customerEmail, List<String> items, String paymentType)
    {	// Persistencia fake
        EstoqueService estoque = new EstoqueService();
        // Nome um pouco mais coeso
        double valorTotalDaOrdem = 0;
        for (String item : items) {
            valorTotalDaOrdem += estoque.getValueByName(item);
        }

        //Pagamento utilizando strategy e facade implementando
        //Open Close principal
        PagamentoService ps = new PagamentoService();
        ps.processar(new ClientePagamentoModel("William",));

        // Criando classes para responsabilidade unica
        // persistência fake
        new PedidosEntity().salvarNobancoDeDados();
        // envio de email
        Mensagem msg = new MensagemEmail();
        msg.enviar("pedido efetuado",customerEmail);
    }
}

