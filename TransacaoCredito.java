
public class TransacaoCredito extends Transacao {

    public TransacaoCredito(double valor, Conta conta, String descricao, Categoria categoria, boolean recorrencia) {
        super(valor, conta, descricao, categoria, recorrencia);
    }

    public void executarTransacaoCredito() {
        getConta().creditarTransacao(getValor());
    }

    @Override
    public String toString() {
        return "Valor Creditado: R$" + String.format("%.2f", valor) +
                " | Categoria: " + categoria.getNome() +
                " | Conta: " + conta.getNomeConta() +
                " | Descrição: " + descricao;
    }
}
