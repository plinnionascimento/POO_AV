
    public class Promotor<Evento> extends Pessoa {

        private String nomeEmpresa;

        public Promotor(String nome, String cpf, String email, String nomeEmpresa) {
            super(nome, cpf, email);
            this.nomeEmpresa = nomeEmpresa;
        }

        public void publicaEvento(Evento evento) {
            System.out.println("Evento publicado");
        }

        public boolean confirmaUsuario(String nome) {
            return this.nome.equals(nome);
        }
    }
