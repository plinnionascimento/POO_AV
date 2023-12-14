import java.util.List;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private Evento evento;
    private List<Ingresso> ingressos;
    private int status;
    private Pagamento pagamento;

    public Pedido(int numero, Cliente cliente, Evento evento, List<Ingresso> ingressos, int status) {
        this.numero = numero;
        this.cliente = cliente;
        this.evento = evento;
        this.ingressos = ingressos;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean consultarPedido(int numero) {
        return this.numero == numero;
    }

    public void alterarStatus() {
        if (this.status == 1) {
            this.status = 2;
        } else if (this.status == 2) {
            this.status = 3;
        }
    }

    public void inserePagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getDataHoraPedido() {
    }

    public String getValorTotal() {
    }
}
