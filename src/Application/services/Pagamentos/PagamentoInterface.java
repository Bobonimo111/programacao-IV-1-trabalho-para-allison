package Application.services.Pagamentos;

import Application.models.ClientePagamentoModel;

public interface PagamentoInterface {
    void pagar(ClientePagamentoModel cliente);
}
