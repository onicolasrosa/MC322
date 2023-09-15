package src.repositorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class RepositorioItens {
    private String filePathName = "./files/registro_itens.csv";
    private String[] headerNames = {"classe", "titulo", "autor", "categoria", "estadoConservacao", "localizacao", "codigoSerial", "disponivel",
                                     "listaFaixas", "duracaoTotal", "elenco", "legendasAudioDisponiveis", "isbn", "edicao", "formatoArquivo",
                                     "requisitosLeitura", "dataDisponibilidade", "tipoRecurso"};
    private RepositorioWriter repWriter;
    private RepositorioReader repReader;

    public RepositorioItens(RepositorioWriter repWriter, RepositorioReader repReader) {
        this.repWriter = repWriter;
        this.repReader = repReader;
    }

    private void writeHeaderOnly() throws FileNotFoundException {
        repWriter.writeHeaderOnly(filePathName, headerNames);
    }

    private ArrayList<ArrayList<String>> readItems() throws IOException{    
        return repReader.readItems(filePathName);
    }

    private ArrayList<ArrayList<String>> removeStringByIndex(ArrayList<ArrayList<String>> stringList, int targetIndex) {
        ArrayList<ArrayList<String>> csvFileData = new ArrayList<>();
        for(int i = 0; i < stringList.size(); i++) {
            if (i != targetIndex) {
                csvFileData.add(stringList.get(i));
            }
        }
        return csvFileData;
    }

    public void overWriteItems(Object objeto) throws FileNotFoundException {
        repWriter.overWriteObjects(objeto, filePathName, headerNames);
    }

    public void overWriteItems(ArrayList<Object> objetos) throws FileNotFoundException{
        repWriter.overWriteObjects(objetos, filePathName, headerNames);
    }

    public void addItem(Object objeto) throws FileNotFoundException {
        repWriter.addObject(objeto, filePathName, headerNames);
    }

    public void removeItemByIndex(int targetIndex) throws IOException {
        ArrayList<ArrayList<String>> csvFileData = removeStringByIndex(readItems(), targetIndex);
        writeHeaderOnly();
        repWriter.addMultipleString(csvFileData, filePathName, headerNames);
    }

}