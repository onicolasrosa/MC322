package src.repositorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

enum ItemHeader {
    classe, titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial, disponivel, 
    listaFaixas, duracaoTotal, elenco, legendasAudioDisponiveis, isbn, edicao, 
    formatoArquivo, requisitosLeitura, dataDisponibilidade, tipoRecurso;
}
    

public class RepositorioWriter {
    private String pathname;

    public RepositorioWriter(String pathname) {
        this.pathname = pathname;
    }

    private String[] atributeNames() {
        ItemHeader headers[] = ItemHeader.values();
        int lenght = headers.length;
        String[] output = new String[lenght];
        for (int i = 0; i < lenght; i++) {
           output[i] = headers[i].name();
        }
        return output;
    }

    private int indiceHeader(String headerName) {
        String[] atributeNames = atributeNames();
        for (int i = 0; i < atributeNames.length; i++) {
            if (atributeNames[i] == headerName) {
                return i;
            }
        }
        System.out.println("Header " + headerName + " not found");
        return 0;
    }

    private Object[] emptyCsvOutput() {
        int lenght = ItemHeader.values().length;
        Object[] csvOutput = new Object[lenght];
        for(int i = 0; i < lenght; i++) {
            csvOutput[i] = "empty";
        }
        return csvOutput;
    }

    private String getObjectClassName(String fullName) {
        int lastDotIndex = fullName.lastIndexOf(".");
        return fullName.substring(lastDotIndex + 1);
    }

    private static List<?> convertObjectToList(Object obj) {
        List<?> list = new ArrayList<>();
        if (obj.getClass().isArray()) {
            list = Arrays.asList((Object[])obj);
        } else if (obj instanceof Collection) {
            list = new ArrayList<>((Collection<?>)obj);
        }
        return list;
    }

    private String listToSingleString(Object inputObject) {
        List<?> inputList = convertObjectToList(inputObject);
        
        String output = "";
        int listSize = inputList.size();
        for(int i = 0; i < listSize - 1; i++) {
            output += Objects.toString(inputList.get(i), null) + ";";
        }
        output += inputList.get(listSize-1) + ",";
        return output;
        
    }

    private Object[] getObjectAttributeValues(Object objeto) {
        Object[] atributeValues = emptyCsvOutput();

        Class<?> classeAtual = objeto.getClass();
        atributeValues[0] = getObjectClassName(classeAtual.getName());
        
        while (classeAtual != null) {
            Field[] atributos = classeAtual.getDeclaredFields();
            for (Field atributo : atributos) {
                String attributeName = atributo.getName();
                String attributeType = atributo.getType().getName();
                try {
                    atributo.setAccessible(true); //deixa campos privados acessiveis se necessario
                    Object value = atributo.get(objeto);
                    //System.out.println("Attribute Name: " + attributeName);
                    //System.out.println("Attribute Value: " + atributo.get(objeto));
                    //System.out.println("CSV index Value: " + indiceHeader(attributeName));

                    if ( attributeType == "java.util.ArrayList" && value != null) {
                        atributeValues[indiceHeader(attributeName)] = listToSingleString(value);
                    } else {
                        atributeValues[indiceHeader(attributeName)] = value;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            classeAtual = classeAtual.getSuperclass();
        }
        return atributeValues;
    }

    private void writeLine(Object[] csvOutput, PrintWriter out) {
        int headerLenght = csvOutput.length;
        for(int i = 0; i < headerLenght - 1; i++) {
            out.write(csvOutput[i] + ",");
        }
        out.write(csvOutput[headerLenght-1] + "\n");
    }

    public void writeObject(Object objeto) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("./files/registro_itens.csv"));
        Object[] csvOutput = getObjectAttributeValues(objeto);
        writeLine(csvOutput, out);
        out.close();
    }

    public void writeObject(ArrayList<Object> objetos) throws FileNotFoundException{
        PrintWriter out = new PrintWriter(new File(pathname));
        writeLine(atributeNames(), out);
        for(Object objeto : objetos) {
            Object[] csvOutput = getObjectAttributeValues(objeto);
            writeLine(csvOutput, out);
        }
        out.close();
    }
    
}

