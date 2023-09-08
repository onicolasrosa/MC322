package src.itensMultimidia;

public class CD extends Item {
    private String[] listaFaixas;
    private String duracaoTotal;

    public CD(String titulo, String autor, String categoria, int copiasTotal,
              String estadoConservacao, String localizacao, String[] listaFaixas, String duracaoTotal) {
        super(titulo, autor, categoria, copiasTotal, estadoConservacao, localizacao);
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
}
