package src.configuration.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import src.configuration.main.resources.Category;
import src.core.entities.items.Item;
import src.core.entities.members.Member;

public class Library {
    private List<Member> libraryMembers;
    private Map<Integer, Item> libraryItems;
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

    public Map<Integer, Item> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(Map<Integer, Item> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public void addItem(Item item) {
        this.libraryItems.put(item.getserialNumber(), item);
    }

    public void removeItem(Item item) {
        this.libraryItems.remove(item.getserialNumber());
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

    public void addMember(Member member) {
        this.libraryMembers.add(member);
    }

    public void removeMember(Member member) {
        this.libraryMembers.remove(member);
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

}
