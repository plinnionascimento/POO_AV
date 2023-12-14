import javax.swing.text.html.HTML;
import java.time.LocalDate;

public class TesteEvento {

    public static void main(String[] args) {

        Evento evento = new Evento("Show de rock", LocalDate.of(2024, 3, 12), "Arena Mineira", 100.00, new Promotor("Fulano de Tal", "123.456.789-00", "Promotora XYZ"));

        System.out.println(evento.consultarEvento("Show de rock")); // true
        System.out.println(evento.consultarEvento("Show de pop")); // false

        evento.inserirTag(new HTML.Tag("rock"));
        evento.inserirTag(new HTML.Tag("brasileiro"));

        System.out.println(evento.getTags()); // [rock, brasileiro]
    }
}
