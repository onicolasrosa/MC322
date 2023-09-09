package src.itensMultimidia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class RepositorioItens {

    public RepositorioItens() {
        System.out.println("Repositorio Inicializado");
    }

    public void write_object(Object objeto) throws FileNotFoundException {
        File csvFile = new File("./files/registro_itens.csv");
        PrintWriter out = new PrintWriter(csvFile);
    
        Class<?> classeAtual = objeto.getClass();
        out.write(classeAtual.getName() + ", ");
        out.write("0, ");

        while (classeAtual != null) {
            Field[] atributos = classeAtual.getDeclaredFields();
            for (Field atributo : atributos) {
                String attributeName = atributo.getName();
                try {
                    atributo.setAccessible(true); //deixa campos privados acessiveis se necessario
                    Object value = atributo.get(objeto);
                    System.out.println("Attribute Name: " + attributeName);
                    System.out.println("Attribute Value: " + value);

                    out.printf(value + ",");

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            classeAtual = classeAtual.getSuperclass();
        }
        out.write("END\n");
        out.close();
    }
}