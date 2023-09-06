package src.itensMultimidia;

public class DVD extends Item {
    private String elenco;
    private String duracao;
    private int copiasTotal;
    private int copiasDisponiveis;
    private String legendasAudioDisponiveis;

    public DVD(String title, String author, String category, String elenco, String duracao,
               int copiasTotal, int copiasDisponiveis, String legendasAudioDisponiveis, String estadoConservacao, String localizacao) {
        super(title, author, category, copiasTotal, copiasDisponiveis, estadoConservacao, localizacao);
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

    public String getLegendasAudioDisponiveis() {
        return legendasAudioDisponiveis;
    }

    public void setLegendasAudioDisponiveis(String legendasAudioDisponiveis) {
        this.legendasAudioDisponiveis = legendasAudioDisponiveis;
    }
}
