package src.entrypoints.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import src.core.entities.items.MultimediaItem;
import src.core.entities.members.Member;
import src.entrypoints.main.resources.Category;

public class Library {
    private List<Member> libraryMembers;
    private Map<Integer, MultimediaItem> libraryItems;
    private Set<Category> libraryCategories;

    public Library() {
        this.libraryMembers = new ArrayList<>();
        this.libraryItems = new HashMap<>();
        this.libraryCategories = new HashSet<>();
    }

    public List<Member> getLibraryMembers() {
        return libraryMembers;
    }

    public void setLibraryMembers(List<Member> libraryMembers) {
        this.libraryMembers = libraryMembers;
    }

    public Collection<MultimediaItem> getLibraryItems() {
        return libraryItems.values();
    }

    public void setLibraryItems(Map<Integer, MultimediaItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public Set<Category> getLibraryCategories() {
        return this.libraryCategories;
    }

    public void setLibraryCategories(Set<Category> libraryCategories) {
        this.libraryCategories = libraryCategories;
    }

    public void addLibraryCategories(Category libraryCategories) {
        this.libraryCategories.add(libraryCategories);
    }

    public void removeLibraryCategories(Category libraryCategories) {
        this.libraryCategories.remove(libraryCategories);
    }

    public void printLibraryObject(Object objeto) throws IllegalArgumentException, IllegalAccessException {
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
    
    public void addMember(Member member) {
        this.libraryMembers.add(member);
    }

    public Member searchMemberById(int targetID) {
        for (Member member : this.libraryMembers) {
            if (member.getID() == targetID) {
                return member;
            }
        }
        System.out.println("No member were found with the following id: " + targetID);
        return null;
    }

    public void removeMemberById(int targetID) {
        this.libraryMembers.remove(searchMemberById(targetID));
    }

    private boolean containsItem(int targetSN) {
        if (this.libraryItems.containsKey(targetSN)) {
            return true;
        } else {
            return false;
        }
    }

    public void addItem(MultimediaItem item) {
        if (containsItem(item.getserialNumber()) == false) {
            this.libraryItems.put(item.getserialNumber(), item);
        } else {
            System.out.println("An item with the following serial number already exists: " + item.getserialNumber());
        }
    }

    public MultimediaItem searchItemBySN(int targetSN) {
        if (containsItem(targetSN)) {
            return this.libraryItems.get(targetSN);
        } else {
            System.out.println("No items were found with the following serial number: " + targetSN);
            return null;
        }
    }

    public void removeItemBySN(int targetSN) {
        if (containsItem(targetSN)) {
            this.libraryItems.remove(targetSN);
        } else {
            System.out.println("No items were found with the following serial number: " + targetSN);
        }
    }

}
