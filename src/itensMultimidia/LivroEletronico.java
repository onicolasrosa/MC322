package src.itensMultimidia;

public class LivroEletronico extends Item {
    private String formato;
    private int numeroTotalLicencas;
    private String formatoArquivo;
    private String urlAcesso;
    private String requisitosLeitura;
    private String dataDisponibilidade;

    public LivroEletronico(String title, String author, String category, int copiasTotal, int copiasDisponiveis,
                           String estadoConservacao, String formato, int numeroTotalLicencas, String formatoArquivo,
                           String urlAcesso, String requisitosLeitura, String dataDisponibilidade) {
        super(title, author, category, copiasTotal, copiasDisponiveis, estadoConservacao);
        this.formato = formato;
        this.numeroTotalLicencas = numeroTotalLicencas;
        this.formatoArquivo = formatoArquivo;
        this.urlAcesso = urlAcesso;
        this.requisitosLeitura = requisitosLeitura;
        this.dataDisponibilidade = dataDisponibilidade;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroTotalLicencas() {
        return numeroTotalLicencas;
    }

    public void setNumeroTotalLicencas(int numeroTotalLicencas) {
        this.numeroTotalLicencas = numeroTotalLicencas;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    public String getUrlAcesso() {
        return urlAcesso;
    }

    public void setUrlAcesso(String urlAcesso) {
        this.urlAcesso = urlAcesso;
    }

    public String getRequisitosLeitura() {
        return requisitosLeitura;
    }

    public void setRequisitosLeitura(String requisitosLeitura) {
        this.requisitosLeitura = requisitosLeitura;
    }

    public String getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public void setDataDisponibilidade(String dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
    }
}
