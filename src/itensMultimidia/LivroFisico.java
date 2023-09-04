package src.itensMultimidia;

public class LivroFisico extends Item {
    private String isbn;
    private String edicao;
    private int copiasTotalPorEdicao;
    private int copiasDisponiveisPorEdicao;
    private String localizacao;

    public LivroFisico(String title, String author, String category, int copiasTotal, int copiasDisponiveis,
                       String estadoConservacao, String isbn, String edicao, int copiasTotalPorEdicao,
                       int copiasDisponiveisPorEdicao, String localizacao) {
        super(title, author, category, copiasTotal, copiasDisponiveis, estadoConservacao);
        this.isbn = isbn;
        this.edicao = edicao;
        this.copiasTotalPorEdicao = copiasTotalPorEdicao;
        this.copiasDisponiveisPorEdicao = copiasDisponiveisPorEdicao;
        this.localizacao = localizacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getCopiasTotalPorEdicao() {
        return copiasTotalPorEdicao;
    }

    public void setCopiasTotalPorEdicao(int copiasTotalPorEdicao) {
        this.copiasTotalPorEdicao = copiasTotalPorEdicao;
    }

    public int getCopiasDisponiveisPorEdicao() {
        return copiasDisponiveisPorEdicao;
    }

    public void setCopiasDisponiveisPorEdicao(int copiasDisponiveisPorEdicao) {
        this.copiasDisponiveisPorEdicao = copiasDisponiveisPorEdicao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
