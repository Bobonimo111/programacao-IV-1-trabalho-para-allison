package Application.Pagamentos;

import Application.ClientePagamentoModel;
//Implementado um padrão strategy onde o a responsabilidade das ações fica a carga de uma abstração
//Implementando metódo facade onde a lógica de controle de fluxo
//Fica em outra classe e não a principal
public class PagamentoService {
    public void processar(ClientePagamentoModel payment) {
        if(payment.getPaymentType().equals("pix")){
            new PagamentoPix().pagar(payment);
            return;
        }
        if(payment.getPaymentType().equals("boleto")){
            new PagamentoBoleto().pagar(payment);
            return;
        }
        if(payment.getPaymentType().equals("credito")){
            new PagamentoCredito().pagar(payment);
            return;
        }
    }
}
