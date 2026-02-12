import Application.entity.EstoqueEntity;
import Application.services.EstoqueService;
import Application.services.OrderService;
import Application.services.Pagamentos.PagamentoFacade;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Injetando dependencias
        OrderService orderService = new OrderService(new EstoqueService(new EstoqueEntity()),new PagamentoFacade());

        List<String> items = List.of("sandalia","pirulito","pirulito");

        orderService.ProcessOrder("facol@email.com",items,"boleto");
    }
}

