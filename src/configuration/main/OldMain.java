/*
package src.configuration.main;

import java.io.IOException;

import src.core.entities.infrastructure.Events;
import src.core.entities.items.Book;
import src.core.entities.items.CD;
import src.core.entities.items.DVD;
import src.core.entities.items.EBook;
import src.core.entities.items.resources.Comment;
import src.core.entities.members.GraduateStudent;
import src.core.entities.members.Member;
import src.core.entities.members.Teacher;
import src.core.entities.members.UndergraduateStudent;


public class OldMain {
    public static String[] itemsHeaderNames = new String[]{"classe", "titulo", "autor", "categoria", "estadoConservacao", "localizacao", "codigoSerial", "disponivel",
                                "listaFaixas", "duracaoTotal", "elenco", "legendasAudioDisponiveis", "isbn", "edicao", "formatoArquivo",
                                "requisitosLeitura", "dataDisponibilidade", "tipoRecurso"};
    public static String itemsDataPath = "./files/registro_itens.csv";

    public static String[] membersHeaderNames = new String[]{"classe", "nome", "ID", "endereco", "contato", "dataRegistro", "emprestimos", "multas"};
    public static String membersDataPath = "./files/registro_membros.csv";



    public static void main(String[] args) throws IOException, IllegalArgumentException, IllegalAccessException{
        UndergraduateStudent estudanteGrad = new UndergraduateStudent("João", 001, "Rua A", "joao@email.com", "2023-09-13");
        GraduateStudent estudantePosGrad = new GraduateStudent("Maria", 002, "Rua B", "maria@email.com", "2023-09-14");
        Teacher professor = new Teacher("Carlos", 003, "Rua C", "carlos@email.com", "2023-09-15");
        UndergraduateStudent estudanteGrad2 = new UndergraduateStudent("Lucas", 004, "Rua D", "l260577@gmail.com", "2023-09-16");
        

        Book livroFisico1 = new Book("Dom Quixote", "Miguel de Cervantes", "Livro Clássico", "Bom", "Estante4", 
                                                   0, "ISBN123456", "1ª Edição");

        Book livroFisico2 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", "Livro de Fantasia", "Bom", "Estante4", 
                                                   1, "ISBN9780345339706", "Edição Especial");

        EBook livroEletronico1 = new EBook("Aventuras no Espaço", "Autor de Ficção", "Ficção", 
                                                               "Excelente", "Estante3", 2, "Primeira", "PDF", 
                                                               "Requisitos mínimos: Leitor de PDF", "2023-09-08");

        EBook livroEletronico2 = new EBook("A História da Ciência", "Carl Sagan", "Livro", 
                                                               "Excelente", "Estante3", 3, "Primeira", "ePub", 
                                                               "Requisitos mínimos: Leitor de ePub", "2023-09-15");

        CD cd1 = new CD("Álbum de Rock Clássico", "Banda Clássica", "Música", "Excelente", "Estante1", 
                       4, "Bohemian Rhapsody; Hotel California; Stairway to Heaven", "50 minutos");


        CD cd2 = new CD("Álbum de Jazz", "Miles Davis", "Música", "Ótimo", "Estante1", 
                       5, "So What; All Blues; Blue in Green", "42 minutos");

        DVD dvd1 = new DVD("Filme de Ação", "Diretor Famoso", "Filme", "Ótimo", "Estante2", 
                           6, "Brad Pitt; Angelina Jolie", "140 minutos", "Português, Inglês");

        DVD dvd2 = new DVD("Filme de Comédia", "Diretor Cômico", "Filme", "Bom", "Estante2", 
                           7, "Jim Carrey; Jennifer Aniston", "96 minutos", "Português, Inglês");


        Library biblioteca = new Library();

        biblioteca.addMember(estudanteGrad);
        biblioteca.addMember(estudanteGrad2);
        biblioteca.addMember(estudantePosGrad);
        biblioteca.addMember(professor);

        biblioteca.addItem(livroFisico1);
        biblioteca.addItem(livroFisico2);
        biblioteca.addItem(livroEletronico1);
        biblioteca.addItem(livroEletronico2);
        biblioteca.addItem(cd1);
        biblioteca.addItem(cd2);
        biblioteca.addItem(dvd1);
        biblioteca.addItem(dvd2);

        /*
        /*
        biblioteca.printLibraryObject(biblioteca);
        for (Object member : biblioteca.getLibraryMembers()) {
            biblioteca.printLibraryObject(member);
            System.out.println("------------------------------");
        }
        for (Object item : biblioteca.getLibraryItems()) {
            biblioteca.printLibraryObject(item);
            System.out.println("------------------------------");
        }

        for(Category categoria : Category.values()) { 
            biblioteca.addLibraryCategories(categoria);
        }
        for(Category categoria : biblioteca.getLibraryCategories()) { 
            System.out.println(categoria.toString());
            System.out.println("------------------------------");
        }
        */
        /*
        Events eventoPalestra = new Events(Events.TipoDeEvento.PALESTRA, "Tópico da Palestra", "2023-09-16", "10:00", "Local da Palestra");
        for (Member member : biblioteca.getLibraryMembers()) {
            eventoPalestra.addMember(member);
        }
        for (Member member : eventoPalestra.getMembrosParticipantes()) {
            System.out.println(biblioteca.searchMemberById(member.getID()).toString());
            System.out.println("------------------------------");
        }

        Comment comentario1 = new Comment(1, 0, "Este livro é um clássico da literatura!");
        Comment comentario2 = new Comment(2, 0, "Adoro as aventuras de Dom Quixote!");
        Comment comentario3 = new Comment(3, 0, "Miguel de Cervantes é um autor incrível!");
    
        System.out.println(livroFisico1.toString());
        System.out.println("---------COMENTARIOS----------");
        livroFisico1.addComentario(comentario1);
        livroFisico1.addComentario(comentario2);
        livroFisico1.addComentario(comentario3);

    }
}
*/