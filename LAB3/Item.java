package LAB3;

class Item {
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

}

class Livro extends Item {

    public Livro(String title, String author, String category, String location, String situation) {
        super(title, author, category, location, situation);
        //TODO Auto-generated constructor stub
    }

}