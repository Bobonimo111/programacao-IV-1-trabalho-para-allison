package Application.Pagamentos;

import Application.ClientePagamentoModel;

public class PagamentoCredito implements PagamentoInterface{
    @Override
    public void pagar(ClientePagamentoModel cliente) {
        System.out.println(cliente.getNome() + " Agora deve o banco o meu ta pago");
    }
}
