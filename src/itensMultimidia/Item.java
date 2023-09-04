package src.itensMultimidia;

abstract class Item {
    private String title;
    private String author;
    private String category;
    private int copiasTotal;
    private int copiasDisponiveis;
    private String estadoConservacao;

    public Item(String title, String author, String category, int copiasTotal, int copiasDisponiveis, String estadoConservacao) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.copiasTotal = copiasTotal;
        this.copiasDisponiveis = copiasDisponiveis;
        this.estadoConservacao = estadoConservacao;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
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

}