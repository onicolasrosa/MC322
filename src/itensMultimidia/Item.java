package src.itensMultimidia;

abstract class Item {
    private String titulo;
    private String autor;
    private String categoria;
    private String estadoConservacao;
    private String localizacao;
    private String codigoSerial; //representa a unidade unica de cada item, codigo com 4 letras e 4 numeros
    private boolean disponivel;

    protected Item(String titulo, String autor, String categoria, String estadoConservacao, String localizacao, String codigoSerial) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.estadoConservacao = estadoConservacao;
        this.localizacao = localizacao;
        this.disponivel = true;
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

    public String getCodigoSerial() {
        return codigoSerial;
    }
    public void setCodigoSerial(String codigoSerial) {
        this.codigoSerial = codigoSerial;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}