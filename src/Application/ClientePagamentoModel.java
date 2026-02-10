package Application;

public class ClientePagamentoModel {
    private String nome;
    private double valor;
    private String paymentType;


    ClientePagamentoModel(String nome, double valor, String paymentType) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
