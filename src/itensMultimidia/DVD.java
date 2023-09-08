package src.itensMultimidia;

public class DVD extends Item {
    private String elenco;
    private String duracao;
    private String legendasAudioDisponiveis;

    public DVD(String titulo, String autor, String categoria, int copiasTotal, String estadoConservacao, 
                String localizacao, String elenco, String duracao, String legendasAudioDisponiveis) {
        super(titulo, autor, categoria, copiasTotal, estadoConservacao, localizacao);
        this.elenco = elenco;
        this.duracao = duracao;
        this.legendasAudioDisponiveis = legendasAudioDisponiveis;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getLegendasAudioDisponiveis() {
        return legendasAudioDisponiveis;
    }

    public void setLegendasAudioDisponiveis(String legendasAudioDisponiveis) {
        this.legendasAudioDisponiveis = legendasAudioDisponiveis;
    }
}
