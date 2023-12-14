public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Beltrano de Souza", "987.654.321-00", "beltrano@souza.com", 123456789);

        cliente.compraIngresso(new Evento("Show de rock", "12/03/2024", "Arena Mineira"), 2);

        System.out.println(cliente.confirmaUsuario("Beltrano de Souza")); // true
        System.out.println(cliente.confirmaUsuario("Fulano de Tal")); // false
    }
}
