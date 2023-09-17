package src.items;

import java.util.ArrayList;

public class DVD extends Item {
    private ArrayList<String> elenco;
    private String duracaoTotal;
    private String legendasAudioDisponiveis;

    private ArrayList<String> getStringList(String listaString) {
        ArrayList<String> output = new ArrayList<>();
        String[] temp = listaString.split(";");
        for(String elemento : temp) {
            output.add(elemento);
        }
        return output;
    }

    public DVD(String titulo, String autor, String categoria, String estadoConservacao, 
                String localizacao, int codigoSerial, String elenco, String duracaoTotal, String legendasAudioDisponiveis) {
        super(titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial);
        this.elenco = getStringList(elenco);
        this.duracaoTotal = duracaoTotal;
        this.legendasAudioDisponiveis = legendasAudioDisponiveis;
    }

    public ArrayList<String> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<String> elenco) {
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
