package src.entrypoints.controllers.libraryManagment;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.core.entities.items.Book;
import src.core.entities.items.CD;
import src.core.entities.items.DVD;
import src.core.entities.items.EBook;
import src.core.entities.items.Item;
import src.core.entities.items.MultimediaResource;

public interface ObjectCreation {
    default void fillObjectInfo(Object objeto, Scanner scanner) throws IllegalArgumentException, IllegalAccessException {
        Class<?> classeAtual = objeto.getClass();
        
        while (classeAtual != null) {
            Field[] atributos = classeAtual.getDeclaredFields();
            
            for (Field atributo : atributos) {
                atributo.setAccessible(true); //deixa campos privados acessiveis se necessario
                
                if (atributo.getType().getName() == "java.util.ArrayList") {
                    System.out.println("Digite a quantidade de elementos de " + atributo.getName() + ": ");
                    int lenght = scanner.nextInt();
                    scanner.nextLine();
                    ArrayList<Object> inputList = new ArrayList<>();
                    for (int i = 0; i < lenght; i++) {
                        System.out.println("Digite o elemento " + i + ": ");
                        Object inputObject = scanner.nextInt();
                        scanner.nextLine();
                        inputList.add(inputObject);
                    }
                    atributo.set(objeto, inputList);

                } else if (atributo.getType().getName() == "java.util.List") {
                    System.out.println("Digite a quantidade de elementos de " + atributo.getName() + "(int): ");
                    int lenght = scanner.nextInt();
                    scanner.nextLine();
                    List<Object> inputList = new ArrayList<>();
                    for (int i = 0; i < lenght; i++) {
                        System.out.println("Digite o elemento " + i + ": ");
                        Object inputObject = scanner.next();
                        scanner.nextLine();
                        inputList.add(inputObject);
                    }
                    atributo.set(objeto, inputList);

                } else if (atributo.getType().getName() == "int") {
                    System.out.print("Digite o valor de " + atributo.getName() + "(int): ");
                    int input = scanner.nextInt();
                    scanner.nextLine();
                    atributo.setInt(objeto, input);

                } else if (atributo.getType().getName() == "boolean") {
                    System.out.print("Digite o valor de " + atributo.getName() + "(boolean): ");
                    boolean input = scanner.nextBoolean();
                    scanner.nextLine();
                    atributo.setBoolean(objeto, input);

                } else {
                    System.out.print("Digite o valor de " + atributo.getName() + "(" + atributo.getType().getName() + "): ");
                    Object input = scanner.next();
                    scanner.nextLine();
                    atributo.set(objeto, input);
                }
                
            }
            classeAtual = classeAtual.getSuperclass();
        }
    }

    public static Book createNullBook() {
        return new Book(null, null, null, null, null, 0, null, null);
    }

    public static CD createNullCD() {
        return new CD(null, null, null, null, null, 0, null, null);
    }

    public static DVD createNullDVD() {
        return new DVD(null, null, null, null, null, 0, null, null, null);
    }

    public static EBook createNullEBook() {
        return new EBook(null, null, null, null, null, 0, null, null, null, null);
    }

    public static MultimediaResource createNullMultimediaResource() {
        return new MultimediaResource(null, null, null, null, null, 0, null, null);
    }

    default Item createNullItem(String itemOption) {
        switch (itemOption) {
            case "Book":
                return createNullBook();
            case "CD":
                return createNullCD();
            case "DVD":
                return createNullDVD();
            case "EBook":
                return createNullEBook();
            case "MultimediaResource":
                return createNullMultimediaResource();
        }
        return null;
    }

    default Item createItem(String itemOption, Scanner scanner) throws IllegalArgumentException, IllegalAccessException {
        Item item = createNullItem(itemOption);
        fillObjectInfo(item, scanner);
        return item;
    }

}

// invoke needs to be implemented, it will help to create and instantiate objects