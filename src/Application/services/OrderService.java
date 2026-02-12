package Application.services;

import Application.models.ClientePagamentoModel;
import Application.services.Pagamentos.PagamentoFacade;
import Application.entity.PedidosEntity;
import Application.messages.Mensagem;
import Application.messages.MensagemEmail;

import java.util.List;

public class OrderService {

    private final EstoqueService estoqueService;
    private final PagamentoFacade pagamentoFacade;

    //Injeção de dependencia
    public OrderService(EstoqueService estoqueService, PagamentoFacade pagamentoFacade) {
        this.estoqueService = estoqueService;
        this.pagamentoFacade = pagamentoFacade;
    }

    public void ProcessOrder(String customerEmail, List<String> items, String paymentType){	// Persistencia fake
        // Nome um pouco mais coeso
        double valorTotalDaOrdem = estoqueService.calcularValorDeListaDeItens(items);

        //Pagamento utilizando strategy e facade implementando
        //Open Close principal
        this.pagamentoFacade.processar(new ClientePagamentoModel(customerEmail,valorTotalDaOrdem,paymentType.toLowerCase()));

        // Criando classes para responsabilidade unica
        // persistência fake
        new PedidosEntity().salvarNobancoDeDados();
        // envio de email
        Mensagem msg = new MensagemEmail();
        msg.enviar("pedido efetuado no valor total " +valorTotalDaOrdem,customerEmail);
    }
}

