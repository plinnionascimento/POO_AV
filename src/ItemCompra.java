public class ItemCompra {

    private int numeroItem;
    private Produto produto;
    private int quantidade;

    public ItemCompra(int numeroItem, Produto produto, int quantidade) {
        this.numeroItem = numeroItem;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void atualizaEstoqueItem() {
        produto.equals(produto.getQuantidade() - quantidade);
    }

    public void atualizaIngresso(Evento evento) {
        evento.setPrecoIngresso(evento.getQtdeIngresso() - quantidade);
    }
}
