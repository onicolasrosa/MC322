package src.repositorio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

enum ItemHeader {
    classe, titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial, disponivel, 
    listaFaixas, duracaoTotal, elenco, legendasAudioDisponiveis, isbn, edicao, 
    formatoArquivo, requisitosLeitura, dataDisponibilidade, tipoRecurso;
}

public class RepositorioReader {
    public RepositorioReader() {
    }

    public ArrayList<ArrayList<String>> readItens(String pathname) throws FileNotFoundException, IOException{
        ArrayList<ArrayList<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathname))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(new ArrayList<>(Arrays.asList(values)));
            }
        }
        return records; 
    }

}
