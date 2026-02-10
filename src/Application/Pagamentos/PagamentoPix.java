package Application.Pagamentos;

import Application.ClientePagamentoModel;

public class PagamentoPix implements PagamentoInterface{
    @Override
    public void pagar(ClientePagamentoModel cliente) {
        System.out.println(cliente.getNome() + " Pagando via Pix");
    }
}
