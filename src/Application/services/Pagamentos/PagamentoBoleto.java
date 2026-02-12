package Application.services.Pagamentos;

import Application.models.ClientePagamentoModel;

public class PagamentoBoleto implements PagamentoInterface{

    @Override
    public void pagar(ClientePagamentoModel cliente) {
        System.out.println("Vai na loterica que a fila ta cheia "+  cliente.getEmail());
    }
}
