public class TesteGerente {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Gerente g1 = new Gerente();
        g1.setNome("Adriano");
        g1.setCpf("2009343");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean autenticou = g1.autentica(0);
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());

    }
}
