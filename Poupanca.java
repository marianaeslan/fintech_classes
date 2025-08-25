public class Poupanca {
    private double valor;
    private double saldoPoupanca;
    private String descricao;
    public Poupanca(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getSaldo() {
        return saldoPoupanca;
    }
    public void setSaldo(double saldo) {
        this.saldoPoupanca = saldo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void addSaldo(double valor) {
        saldoPoupanca += valor;
    }
    public void subSaldo(double valor) {
        saldoPoupanca -= valor;
    }
}
