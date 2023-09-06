package src.itensMultimidia;

public class RecursoMultimidia extends Item {
    private String tipoRecurso;
    private String formato;
    private int copiasTotal;
    private int copiasDisponiveis;

    public RecursoMultimidia(String title, String author, String category, String tipoRecurso, String formato,
                             int copiasTotal, int copiasDisponiveis, String estadoConservacao, String localizacao) {
        super(title, author, category, copiasTotal, copiasDisponiveis, estadoConservacao, localizacao);
        this.tipoRecurso = tipoRecurso;
        this.formato = formato;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
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
}
