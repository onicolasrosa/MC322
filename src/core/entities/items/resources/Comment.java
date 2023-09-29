package src.core.entities.items.resources;

public class Comment {
    private int memberID;
    private int itemSN;
    private String texto;

    public Comment(int memberID, int itemSN, String texto) {
        this.memberID = memberID;
        this.itemSN = itemSN;
        this.texto = texto;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getItemSN() {
        return itemSN;
    }

    public void setItemSN(int itemSN) {
        this.itemSN = itemSN;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}
