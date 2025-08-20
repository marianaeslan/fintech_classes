public class Transacao {
    private int id;
    private double valor;
    private Conta conta;
    private String descricao;
    private Categoria categoria;
    private boolean recorrencia;

    public Transacao(double valor, Conta conta, String descricao, Categoria categoria,  boolean recorrencia) {
        this.id = Id.gerarId();
        this.valor = valor;
        this.conta = conta;
        this.descricao = descricao;
        this.categoria = categoria;
        this.recorrencia = false;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public Conta getConta() {
        return conta;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean isRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(boolean recorrencia) {
        this.recorrencia = recorrencia;
    }

    // Método para executar a transação
    public void executarTransacao() {
        // Verifica se há saldo suficiente
        if (conta.getSaldo() >= valor) {
            conta.debitarTransacao(valor);
            System.out.println("✅ " + toString());
        } else {
            System.out.println("❌ Saldo insuficiente para: " + toString());
        }
    }

    @Override
    public String toString() {
        return "Transação: R$" + String.format("%.2f", valor) +
                " | Categoria: " + categoria.getNome() +
                " | Conta: " + conta.getNomeConta() +
                " | Descrição: " + descricao;
    }
}