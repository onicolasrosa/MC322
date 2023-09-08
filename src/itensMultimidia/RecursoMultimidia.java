package src.itensMultimidia;

public class RecursoMultimidia extends Item {
    private String tipoRecurso;
    private String formato;

    public RecursoMultimidia(String titulo, String autor, String categoria, int copiasTotal, String estadoConservacao, 
                                String localizacao, String tipoRecurso, String formato) {
        super(titulo, autor, categoria, copiasTotal, estadoConservacao, localizacao);
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
}
