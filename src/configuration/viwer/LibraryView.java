package src.configuration.viwer;

import src.configuration.main.Library;
import src.core.entities.items.Item;
import src.core.entities.members.Member;

public class LibraryView implements ViewObject {
    public void printAllMembers(Library library) throws IllegalArgumentException, IllegalAccessException {
        for (Member member : library.getLibraryMembers()) {
            printLibraryObject(member);
            System.out.println("------------------------------");
        }
    }
    public void printAllItems(Library library) throws IllegalArgumentException, IllegalAccessException {
        for (Item item : library.getLibraryItems().values()) {
            printLibraryObject(item);
            System.out.println("------------------------------");
        }
    }
}
