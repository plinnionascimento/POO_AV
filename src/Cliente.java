public class Cliente extends Pessoa {

    private int idCliente;

    public Cliente(String nome, String cpf, String email, int idCliente) {
        super(nome, cpf, email);
        this.idCliente = idCliente;
    }

    public Cliente(String fulanoDeTal, String cpf, String mail) {
        super();
    }

    public void compraIngresso(Evento evento, int quantidade) {
        System.out.println("Ingressos comprados");
    }

    public boolean confirmaUsuario(String nome) {
        return this.nome.equals(nome);
    }
}
