package src.items;

public class RecursoMultimidia extends ItemMultimidia {
    private String tipoRecurso;
    private String formatoArquivo;

    public RecursoMultimidia(String titulo, String autor, String categoria, String estadoConservacao, 
                                String localizacao, int codigoSerial, String tipoRecurso, String formatoArquivo) {
        super(titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial);
        this.tipoRecurso = tipoRecurso;
        this.formatoArquivo = formatoArquivo;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
}
