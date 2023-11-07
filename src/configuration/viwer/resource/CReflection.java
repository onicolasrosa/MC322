package src.configuration.viwer.resource;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

// 1. try and catch was implemented in the file src/dataproviders/repository/resource/Driver.java 
//      method called "getObjectAttributeValues", in this file throws were used instead.
// 2. interface was implemented instead of class to be used on another class("LibraryView") more easily.

public interface CReflection {
    default void printLibraryObjectAttributes(Object object) throws IllegalArgumentException, IllegalAccessException {
        Class<?> classeAtual = object.getClass();
        
        while (classeAtual != null) {
            Field[] atributos = classeAtual.getDeclaredFields();
            
            for (Field atributo : atributos) {
                atributo.setAccessible(true); // set private attributes if necessary
                System.out.println(atributo.getName() + ": " + atributo.get(object));
            }
            classeAtual = classeAtual.getSuperclass();
        }
    }

    default void printLibraryObjectMethods(Object object) throws IllegalArgumentException, IllegalAccessException {
        Class<?> classeAtual = object.getClass();
        
        while (classeAtual != null) {
            Method[] metodos = classeAtual.getDeclaredMethods();
            
            for (Method metodo : metodos) {
                metodo.setAccessible(true); // set private attributes if necessary
                System.out.println(metodo.getName());
            }
            classeAtual = classeAtual.getSuperclass();
        }
    }

    default void printObjectList(List<Object> objects) throws IllegalArgumentException, IllegalAccessException {
        for (Object object : objects) {
            Class<?> classeAtual = object.getClass();
            
            while (classeAtual != null) {
                Field[] atributos = classeAtual.getDeclaredFields();
                
                for (Field atributo : atributos) {
                    atributo.setAccessible(true); // set private attributes if necessary
                    System.out.println(atributo.getName() + ": " + atributo.get(object));
                }
                classeAtual = classeAtual.getSuperclass();
            }
        }
    }
}
