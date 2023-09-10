package src.itensMultimidia;

public class LivroEletronico extends Item {
    private String edicao;
    private String formatoArquivo;
    private String requisitosLeitura;
    private String dataDisponibilidade;


    public LivroEletronico(String titulo, String autor, String categoria, String estadoConservacao, String localizacao, String codigoSerial,
                            String edicao, String formatoArquivo, String requisitosLeitura, String dataDisponibilidade) {
        super(titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial);
        this.edicao = edicao;
        this.formatoArquivo = formatoArquivo;
        this.requisitosLeitura = requisitosLeitura;
        this.dataDisponibilidade = dataDisponibilidade;
    }


    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }
    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
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
