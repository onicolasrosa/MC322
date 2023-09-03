package src.itensMultimidia;

public class CD extends Item {
    private String[] listaFaixas;
    private String duracaoTotal;
    private int copiasTotal;
    private int copiasDisponiveis;

    public CD(String title, String author, String category, String[] listaFaixas, String duracaoTotal,
              int copiasTotal, int copiasDisponiveis, String estadoConservacao) {
        super(title, author, category, copiasTotal, copiasDisponiveis, estadoConservacao);
        this.listaFaixas = listaFaixas;
        this.duracaoTotal = duracaoTotal;
    }

    public String[] getListaFaixas() {
        return listaFaixas;
    }

    public void setListaFaixas(String[] listaFaixas) {
        this.listaFaixas = listaFaixas;
    }

    public String getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(String duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
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
