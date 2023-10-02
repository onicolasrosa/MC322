package src.configuration.viwer;

import java.util.Map;

import src.core.entities.items.Item;
import src.core.entities.items.resources.Comment;

public interface ItemView {
    default void printItem(Item item) {
        item.toString();
    }

    default void printAllAvailableItems(Map<Integer, Item> items) {
        for (Item item : items.values()) {
            if (item.isDisponivel()) {
                printItem(item);
            }
        }
        System.out.println("------------------------------");
    }

    default void printComentarios(Item item) {
        for(Comment comentario : item.getComentarios()) {
            System.out.println(comentario.getTexto());
        }
    }
}
