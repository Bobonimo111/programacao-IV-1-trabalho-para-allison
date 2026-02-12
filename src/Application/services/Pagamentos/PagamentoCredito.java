package Application.services.Pagamentos;

import Application.models.ClientePagamentoModel;

public class PagamentoCredito implements PagamentoInterface{
    @Override
    public void pagar(ClientePagamentoModel cliente) {
        System.out.println(cliente.getEmail() + " Agora deve o banco o meu ta pago");
    }
}
