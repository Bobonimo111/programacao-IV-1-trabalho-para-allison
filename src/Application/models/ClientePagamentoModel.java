package Application.models;

public class ClientePagamentoModel {
    private String email;
    private double valor;
    private String paymentType;


    public ClientePagamentoModel(String email, double valor, String paymentType) {
        this.email = email;
        this.valor = valor;
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
