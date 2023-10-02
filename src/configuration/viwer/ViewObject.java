package src.configuration.viwer;

import java.lang.reflect.Field;

public interface ViewObject {
    default void printLibraryObject(Object objeto) throws IllegalArgumentException, IllegalAccessException {
        Class<?> classeAtual = objeto.getClass();
        
        while (classeAtual != null) {
            Field[] atributos = classeAtual.getDeclaredFields();
            
            for (Field atributo : atributos) {
                atributo.setAccessible(true); //deixa campos privados acessiveis se necessario
                System.out.println(atributo.getName() + ": " + atributo.get(objeto));
            }
            classeAtual = classeAtual.getSuperclass();
        }
    }


}
