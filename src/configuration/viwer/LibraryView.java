package src.configuration.viwer;

import src.configuration.main.Library;
import src.configuration.viwer.resource.CReflection;
import src.core.entities.items.Item;
import src.core.entities.members.Member;

public class LibraryView implements CReflection {
    public void printAllMembers(Library library) throws IllegalArgumentException, IllegalAccessException {
        for (Member member : library.getLibraryMembers()) {
            printLibraryObjectAttributes(member);
            System.out.println("------------------------------");
        }
    }
    public void printAllItems(Library library) throws IllegalArgumentException, IllegalAccessException {
        for (Item item : library.getLibraryItems().values()) {
            printLibraryObjectAttributes(item);
            System.out.println("------------------------------");
        }
    }
}
