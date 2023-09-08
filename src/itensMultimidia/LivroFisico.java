package src.itensMultimidia;

public class LivroFisico extends Item {
    private String isbn;
    private String edicao;
    private int copiasTotalPorEdicao;
    private int copiasDisponiveisPorEdicao;

    public LivroFisico(String titulo, String autor, String categoria, int copiasTotal, String estadoConservacao, 
                        String localizacao, String isbn, String edicao) {
        super(titulo, autor, categoria, copiasTotal, estadoConservacao, localizacao);
        this.isbn = isbn;
        this.edicao = edicao;
        this.copiasTotalPorEdicao = copiasTotal;
        this.copiasDisponiveisPorEdicao = copiasTotalPorEdicao;
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
}
