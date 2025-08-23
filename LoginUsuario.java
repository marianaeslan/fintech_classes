public class LoginUsuario {
    private  int idUsuario;
    private String usuario;
    private String senha;
    public LoginUsuario(String usuario, String senha) {
        this.idUsuario = Id.gerarId();
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }
}
