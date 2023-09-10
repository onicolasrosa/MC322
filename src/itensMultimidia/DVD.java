package src.itensMultimidia;

public class DVD extends Item {
    private String elenco;
    private String duracaoTotal;
    private String legendasAudioDisponiveis;

    public DVD(String titulo, String autor, String categoria, String estadoConservacao, 
                String localizacao, String codigoSerial, String elenco, String duracaoTotal, String legendasAudioDisponiveis) {
        super(titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial);
        this.elenco = elenco;
        this.duracaoTotal = duracaoTotal;
        this.legendasAudioDisponiveis = legendasAudioDisponiveis;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(String duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public String getLegendasAudioDisponiveis() {
        return legendasAudioDisponiveis;
    }

    public void setLegendasAudioDisponiveis(String legendasAudioDisponiveis) {
        this.legendasAudioDisponiveis = legendasAudioDisponiveis;
    }
}
