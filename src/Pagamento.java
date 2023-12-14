import java.time.LocalDate;

public class Pagamento {

    private int numeroPagamento;
    private LocalDate dataHoraPagamento;
    private double valorPago;
    private Pedido pedido;

    public Pagamento(int numeroPagamento, LocalDate dataHoraPagamento, double valorPago, Pedido pedido) {
        this.numeroPagamento = numeroPagamento;
        this.dataHoraPagamento = dataHoraPagamento;
        this.valorPago = valorPago;
        this.pedido = pedido;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public LocalDate getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(LocalDate dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean consultarPagamento(int numeroPagamento) {
        return this.numeroPagamento == numeroPagamento;
    }

    public void gerarImpressaoPagamento() {
        System.out.println("Número do pedido: " + pedido.getNumero());
        System.out.println("Data e hora do pedido: " + pedido.getDataHoraPedido());
        System.out.println("Valor total do pedido: " + pedido.getValorTotal());
        System.out.println("Status do pedido: " + pedido.getStatus());
        System.out.println("Data e hora do pagamento: " + dataHoraPagamento);
        System.out.println("Valor pago: " + valorPago);
    }
}
