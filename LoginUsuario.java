public class LoginUsuario {
    private String usuario;
    private String senha;

    public LoginUsuario(String usuario, String senha) {
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
        if (this.usuario.equals(usuario) && this.senha.equals(senha)){
            System.out.println("=============== ✅ Acesso Permitido ✅ =================");
            return true;
        } else {
            System.out.println("=============== ❌ Acesso Negado ❌ =================");
            return false;
        }

    }
}
