import java.time.LocalDate;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String dataValidade;
    private String codigoSeguranca;

    public CartaoCredito(int numeroPagamento, LocalDate dataHoraPagamento, double valorPago, Pedido pedido, String numeroCartao, String dataValidade, String codigoSeguranca) {
        super(numeroPagamento, dataHoraPagamento, valorPago, pedido);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}
