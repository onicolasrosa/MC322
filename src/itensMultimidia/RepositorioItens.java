package src.itensMultimidia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import src.repositorio.RepositorioReader;
import src.repositorio.RepositorioWriter;

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

    public void overWriteItens(Object objeto) throws FileNotFoundException {
        repWriter.overWriteObjects(objeto, filePathName, headerNames);
    }

    public void overWriteItens(ArrayList<Object> objetos) throws FileNotFoundException{
        repWriter.overWriteObjects(objetos, filePathName, headerNames);
    }

    public ArrayList<ArrayList<String>> readItems() throws IOException{    
        return repReader.readItens(filePathName);
    }

    public void addItem(Object objeto) throws FileNotFoundException {
        repWriter.addObject(objeto, filePathName, headerNames);
    }

}