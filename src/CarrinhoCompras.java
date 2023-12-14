import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<ItemCompra> itensCompra;
    private int status;

    public CarrinhoCompras() {
        itensCompra = new ArrayList<>();
        status = 1;
    }

    public void inserirIngresso(int numeroItem, Produto produto, int quantidade) {
        ItemCompra itemCompra = new ItemCompra(numeroItem, produto, quantidade);
        itensCompra.add(itemCompra);
    }

    public void excluirIngresso(int numeroItem) {
        // O método estará vazio
    }

    public void alterarCompra(int numeroItem, int quantidade) {
        ItemCompra itemCompra = null;
        for (ItemCompra item : itensCompra) {
            if (item.getNumeroItem() == numeroItem) {
                itemCompra = item;
                break;
            }
        }

        if (itemCompra != null) {
            itemCompra.setQuantidade(quantidade);
        }
    }

    public void finalizarCompra() {
        status = 3;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
