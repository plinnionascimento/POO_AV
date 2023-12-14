import java.time.LocalDate;

public class Pix extends Pagamento {

    private String chavePix;

    public Pix(int numeroPagamento, LocalDate dataHoraPagamento, double valorPago, Pedido pedido, String chavePix) {
        super(numeroPagamento, dataHoraPagamento, valorPago, pedido);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
