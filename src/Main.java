package src;

public class Main {
    public static void main(String[] args) {
        Item primeiroItem = new Item("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 
        "Indisponivel", "Indisponivel");
    
        System.out.println(primeiroItem.getTitle());
        System.out.println(primeiroItem.getAuthor());

        Book primeiroLivro = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 
        "Indisponivel", "Indisponivel", 1, 1954);
        System.out.println(primeiroLivro.getCategory());
        System.out.println(primeiroLivro.getPublicationYear());

        DigitalMedia primeiroDvd = new DigitalMedia("Me at the zoo", "jawed", "documentario", 
        "https://www.youtube.com/watch?v=jNQXAC9IVRw", "Disponivel", "mp4", 322);
    
        System.out.println(primeiroDvd.getTitle());
        System.out.println(primeiroDvd.getFormat());

        GraduateStudent lucas = new GraduateStudent()
    }
}
