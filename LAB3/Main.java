package LAB3;

public class Main {
    public static void main(String[] args) {
        Item primeiroItem = new Item("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "Indisponivel", "Indisponivel");
    
        System.out.println(primeiroItem.getTitle());
        System.out.println(primeiroItem.getAuthor());
        System.out.println(primeiroItem);
    
    }
}
