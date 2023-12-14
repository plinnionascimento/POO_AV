public class TestePessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Fulano de Tal", "123.456.789-00", "fulano@tal.com");

        System.out.println(pessoa.getNome()); // Fulano de Tal
        System.out.println(pessoa.getCpf()); // 123.456.789-00
        System.out.println(pessoa.getEmail()); // fulano@tal.com

        pessoa.setNome("Beltrano de Souza");
        pessoa.setCpf("987.654.321-00");
        pessoa.setEmail("beltrano@souza.com");

        System.out.println(pessoa.getNome()); // Beltrano de Souza
        System.out.println(pessoa.getCpf()); // 987.654.321-00
        System.out.println(pessoa.getEmail()); // beltrano@souza.com
    }
}