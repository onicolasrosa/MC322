package src.items;

import java.util.ArrayList;

public class CD extends Item {
    private ArrayList<String> listaFaixas;
    private String duracaoTotal;

    private ArrayList<String> getStringList(String listaString) {
        ArrayList<String> output = new ArrayList<>();
        String[] temp = listaString.split(";");
        for(String elemento : temp) {
            output.add(elemento);
        }
        return output;
    }

    public CD(String titulo, String autor, String categoria, String estadoConservacao,
              String localizacao, int codigoSerial, String listaFaixas, String duracaoTotal) {
        super(titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial);
        this.listaFaixas = getStringList(listaFaixas);
        this.duracaoTotal = duracaoTotal;
    }

    public ArrayList<String> getListaFaixas() {
        return listaFaixas;
    }

    public void setListaFaixas(ArrayList<String> listaFaixas) {
        this.listaFaixas = listaFaixas;
    }

    public String getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(String duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }
}
