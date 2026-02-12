package Application.services.Pagamentos;

import Application.models.ClientePagamentoModel;

public class PagamentoPix implements PagamentoInterface{
    @Override
    public void pagar(ClientePagamentoModel cliente) {
        System.out.println(cliente.getEmail() + " Pagando via Pix");
    }
}
