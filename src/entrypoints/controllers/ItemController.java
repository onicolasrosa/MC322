package src.entrypoints.controllers;

import src.configuration.main.Library;
import src.configuration.viwer.ItemView;
import src.core.entities.items.Item;
import src.entrypoints.controllers.libraryManagment.ObjectCreation;

public class ItemController implements ItemView, ObjectCreation {
    private boolean containsItemBySN(Library library, int targetSN) {
        if (library.getLibraryItems().containsKey(targetSN)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean containsItem(Library library, Item item) {
        if (library.getLibraryItems().containsValue(item)) {
            return true;
        } else {
            return false;
        }
    }

    public void addItem(Library library, Item item) {
        if (containsItem(library, item) == false) {
            library.addItem(item);
        } else {
            System.out.println("An item with the following serial number already exists: " + item.getserialNumber());
        }
    }

    public Item searchItemBySN(Library library, int targetSN) {
        if (containsItemBySN(library, targetSN)) {
            return library.getLibraryItems().get(targetSN);
        } else {
            System.out.println("No items were found with the following serial number: " + targetSN);
            return null;
        }
    }

    public void removeItemBySN(Library library, int targetSN) {
        if (containsItemBySN(library, targetSN)) {
            library.removeItem(searchItemBySN(library, targetSN));
        } else {
            System.out.println("No items were found with the following serial number: " + targetSN);
        }
    }

    public void removeItem(Library library, Item item) {
        if (containsItem(library, item)) {
            library.removeItem(item);
        } else {
            System.out.println("No items were found with the following serial number: " + item.getserialNumber());
        }
    }

}
