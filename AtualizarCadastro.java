public class AtualizarCadastro {
    private String novoEmail;
    private String novaSenha;
    public AtualizarCadastro(String novoEmail, String novaSenha) {
        this.novoEmail = novoEmail;
        this.novaSenha = novaSenha;
    }
    public String getNovoEmail() {
        return novoEmail;
    }
    public void setNovoEmail(String novoEmail) {
        this.novoEmail = novoEmail;
    }
    public String getNovaSenha() {
        return novaSenha;
    }
    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
}
