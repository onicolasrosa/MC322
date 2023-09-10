package src.itensMultimidia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import src.repositorio.RepositorioReader;
import src.repositorio.RepositorioWriter;

public class RepositorioItens {
    private String filePathName = "./files/registro_itens.csv";

    public void writeItem(Object objeto) throws FileNotFoundException {
        RepositorioWriter repWriterItens = new RepositorioWriter(filePathName);        
        repWriterItens.writeObject(objeto);
    }

    public void writeItem(ArrayList<Object> objetos) throws FileNotFoundException{
        RepositorioWriter repWriterItens = new RepositorioWriter(filePathName);        
        repWriterItens.writeObject(objetos);
    }

    public ArrayList<ArrayList<String>> readItems() throws IOException{
        RepositorioReader repReaderItens = new RepositorioReader(filePathName);        
        return repReaderItens.readItens();
    }

}