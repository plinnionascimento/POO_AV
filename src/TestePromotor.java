public class TestePromotor {

    public static void main(String[] args) {

        Promotor promotor = new Promotor("Fulano de Tal", "123.456.789-00", "fulano@tal.com", "Promotora XYZ");

        promotor.publicaEvento(new Evento("Show de rock", "12/03/2024", "Arena Mineira"));

        System.out.println(promotor.confirmaUsuario("Fulano de Tal")); // true
        System.out.println(promotor.confirmaUsuario("Beltrano de Souza")); // false
    }
}