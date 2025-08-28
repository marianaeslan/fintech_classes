public class Main {
    public static void main(String[] args) {

        // Classes teste

        // Criação das categorias
        Categoria lazer = new Categoria("Lazer");
        Categoria alimentacao = new Categoria("Alimentacao");
        Categoria contaLuz = new Categoria("Conta Luz");
        Categoria iptu = new Categoria("IPTU");
        Categoria salario = new Categoria("Salario");

        // Realizando Cadastro
        CriarCadastro cadastro = new CriarCadastro(
                "Beatriz",
                "bea.triz@mail.com",
                "000.000.000-00",
                "98877-1551",
                "12344321"
                );
        System.out.println("Criando usuario " + cadastro.criarUsuario());

        // Realizando Login
        LoginUsuario login = new LoginUsuario("bea.triz", "12344333");
        System.out.println("Autenticando..." + login.autenticar("beatriz", "11228899"));
        System.out.println("Autenticando..." + login.autenticar("bea.triz", "12344333"));

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
        TransacaoCredito transacaoCred = new TransacaoCredito(1700, contaItau, "Salario mês agosto", salario, true);

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

        // Executa a transação (credito em conta)
        transacaoCred.executarTransacao();
        System.out.println("💸 Valor creditado: R$" + String.format("%.2f", transacaoCred.getValor()));
        System.out.println("💸 Saldo final Itaú: R$" + String.format("%.2f", contaItau.getSaldo()));
        System.out.println("---------------------------------------------------------------------------------------");

        // Adicionando Valor na Poupanca
        Poupanca poupanca = new Poupanca(150.00, "caixinha do mês");
        Poupanca poupanca2 = new Poupanca(200.00, "caixinha do mês");
        poupanca.addSaldo(poupanca.getValor());
        poupanca.addSaldo(poupanca2.getValor());
        System.out.println("💸 Valor guardado na poupança: R$" + String.format("%.2f", poupanca.getValor()));
        System.out.println("💸 Valor guardado na poupança: R$" + String.format("%.2f", poupanca2.getValor()));
        System.out.println("💸 Saldo total: R$" + String.format("%.2f", poupanca.getSaldo()));
        System.out.println("---------------------------------------------------------------------------------------");

        // Resgatando Valor da Poupanca
        poupanca.subSaldo(50.00);
        System.out.println("💸 Valor resgatado! | Saldo total: R$" + String.format("%.2f", poupanca.getSaldo()));
    }
}