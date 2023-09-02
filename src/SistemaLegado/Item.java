package src.SistemaLegado;
public class Item {
    private String title;
    private String author;
    private String category;
    private String location;
    private String situation;

    public Item(String title, String author, String category, String location, String situation) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.location = location;
        this.situation = situation;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getSituation() {
        return situation;
    }
    public void setSituation(String situation) {
        this.situation = situation;
    }

public class Book extends Item {
    private int edition;
    private int publicationYear;

    public Book(String title, String author, String category, String location, String situation,
                    int edition, int publicationYear) {
        super(title, author, category, location, situation);
        this.edition = edition;
        this.publicationYear = publicationYear;
    }

    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}

public class DigitalMedia extends Item {
    private String format;
    private float memorySize; //tamanho em Mega Bytes(MB)

    public DigitalMedia(String title, String author, String category, String location, String situation,
                    String format, float memorySize) {
        super(title, author, category, location, situation);
        this.format = format;
        this.memorySize = memorySize;
    }

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    
    public float getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(float memorySize) {
        this.memorySize = memorySize;
    }

}

}