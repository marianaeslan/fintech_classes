public class Main {
    public static void main(String[] args) {

        // Criação das categorias
        Categoria lazer = new Categoria("Lazer");
        Categoria alimentacao = new Categoria("Alimentacao");
        Categoria contaLuz = new Categoria("Conta Luz");
        Categoria iptu = new Categoria("IPTU");

        // Criação dos usuários e suas contas
        Usuario usuario = new Usuario("Mariana", "mari@icloud.com", "1122MariEslan");
        Conta contaNubank = new Conta("Nubank", 350.00);

        Usuario usuario2 = new Usuario("Camila", "camomila@mail.com", "112233");
        Conta contaBB = new Conta("Banco do Brasil", 600.00);

        Usuario usuario3 = new Usuario("Carlos", "carlinhos@hotmail.com", "1111haha");
        Conta contaItau = new Conta("Itau", 730.00);

        // Criação das transações
        Transacao transacao = new Transacao(230.00, contaNubank, "5 anos de Casamento", lazer, false);
        Transacao transacao2 = new Transacao(630.00, contaBB, "Despesas casa", iptu, true);
        Transacao transacao3 = new Transacao(370.00, contaItau, "Compra semanal", alimentacao, true);


        System.out.println("=== EXECUTANDO TRANSAÇÕES ===");
        // Exibindo informações
        System.out.println("ID do usuário: " + usuario.getId());
        // Executando as transações

        System.out.println("\n🏦 Saldo inicial Banco do Brasil: R$" + String.format("%.2f", contaBB.getSaldo()));

        // Executa a transação (debita da conta)
        transacao2.executarTransacao();
        System.out.println("💸 Saldo final Banco do Brasil: R$" + String.format("%.2f", contaBB.getSaldo()));
        System.out.println("---------------------------------------------------------------------------------------");


        System.out.println("ID do usuário: " + usuario3.getId());
        // Executando as transações
        System.out.println("\n🏦 Saldo inicial Itaú: R$" + String.format("%.2f", contaItau.getSaldo()));

        // Executa a transação (debita da conta)
        transacao3.executarTransacao();
        System.out.println("💸 Saldo final Itaú: R$" + String.format("%.2f", contaItau.getSaldo()));
        System.out.println("---------------------------------------------------------------------------------------");


    }
}