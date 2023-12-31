package src.core.entities.items;

public class Book extends Item {
    private String isbn;
    private String edicao;

    public Book(String titulo, String autor, String categoria, String estadoConservacao, 
                        String localizacao, int codigoSerial, String isbn, String edicao) {
        super(titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial);
        this.isbn = isbn;
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
}
