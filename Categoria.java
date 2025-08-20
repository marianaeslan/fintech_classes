public class Categoria {
    private int idCategoria;
    private String nome;

    public Categoria(String nome) {
        this.idCategoria = Id.gerarId();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return nome;
    }

}
