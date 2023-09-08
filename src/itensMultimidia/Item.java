package src.itensMultimidia;

abstract class Item {
    private String titulo;
    private String autor;
    private String categoria;
    private int copiasTotal;
    private int copiasDisponiveis;
    private String estadoConservacao;
    private String localizacao;

    protected Item(String titulo, String autor, String categoria, int copiasTotal, 
                String estadoConservacao, String localizacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.copiasTotal = copiasTotal;
        this.copiasDisponiveis = copiasTotal;
        this.estadoConservacao = estadoConservacao;
        this.localizacao = localizacao;
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
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCopiasTotal() {
        return copiasTotal;
    }
    public void setCopiasTotal(int copiasTotal) {
        this.copiasTotal = copiasTotal;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }
    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }
    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}