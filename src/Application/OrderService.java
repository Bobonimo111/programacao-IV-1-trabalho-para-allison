package Pagamento;

import java.util.List;

class OrderService {
    public void ProcessOrder(String customerEmail, List<String> items, String paymentType)
    {	// cálculo simples
        double total = 0; for (String item : items) { total += 10.0;
    }
        // pagamento
        if (paymentType.equals("credit")) {
            System.out.println("Pagando com cartão de crédito: " + total);
        } else if (paymentType.equals("pix")) {
            System.out.println("Pagando com PIX: " + total);
        } else if (paymentType.equals("boleto")) {
            System.out.println("Pagando com boleto: " + total);
        }
        // persistência fake
        System.out.println("Salvando pedido no banco");
        // envio de email
        System.out.println("Enviando email para " + customerEmail);
    }
}

