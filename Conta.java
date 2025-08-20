public class Conta {
    private int idConta;
    private String nomeConta;
    private double saldo;

    public Conta(String nomeConta, double saldo) {
        this.idConta = Id.gerarId();
        this.nomeConta = nomeConta;
        this.saldo = saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void debitarTransacao(double valorTransacao) {
        this.saldo -= valorTransacao;
    }

    public void creditarTransacao(double valorTransacao) {
        this.saldo += valorTransacao;
        System.out.println("Novo saldo: R$" + String.format("%.2f", saldo));
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    @Override
    public String toString() {
        return "Conta: Nome: " + nomeConta + ", Saldo: " + saldo;
    }
}
