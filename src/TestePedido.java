import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestePedido {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Fulano de Tal", "123.456.789-00", "fulano@tal.com");
        Evento evento = new Evento("Show de rock", LocalDate.of(2024, 3, 12), "Arena Mineira", 100.00, new Promotor("Fulano de Tal", "123.456.789-00", "Promotora XYZ"));
        List<Ingresso> ingressos = new ArrayList<>();
        ingressos.add(new Ingresso(evento, 100.00));

        Pedido pedido = new Pedido(1, cliente, evento, ingressos, 1);

        System.out.println(pedido.consultarPedido(1)); //
