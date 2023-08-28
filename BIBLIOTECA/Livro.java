package BIBLIOTECA;

public class Livro {
    private String titulo;
    private String autor;
    private String edicao;
    private int anoPublicacao;
    private String categoria;
    private String situacao;

    public Livro(String titulo, String autor, String edicao, int anoPublicacao, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.situacao = "Disponível";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void emprestar() {
        situacao = "Emprestado";
    }

    public void devolver() {
        situacao = "Disponível";
    }
}