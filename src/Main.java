package src;

import src.itensMultimidia.CD;
import src.itensMultimidia.DVD;
import src.itensMultimidia.LivroEletronico;
import src.itensMultimidia.LivroFisico;
import src.itensMultimidia.RecursoMultimidia;

public class Main {
    public static void main(String[] args) {
        LivroFisico livroFisico1 = new LivroFisico("Dom Quixote", "Miguel de Cervantes", "Livro Clássico", 5, "Bom", "Estante4", 
                                                   "ISBN123456", "1ª Edição");
        System.out.println("Título do Livro Físico: " + livroFisico1.getTitulo());
        System.out.println("ISBN do Livro Físico: " + livroFisico1.getIsbn());
        System.out.println("Edição do Livro Físico: " + livroFisico1.getEdicao());


        LivroFisico livroFisico2 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", "Livro de Fantasia", 7, "Bom", "Estante4", 
                                                   "ISBN9780345339706", "Edição Especial");
        System.out.println("Título do Livro Físico: " + livroFisico2.getTitulo());
        System.out.println("ISBN do Livro Físico: " + livroFisico2.getIsbn());
        System.out.println("Edição do Livro Físico: " + livroFisico2.getEdicao());


        LivroEletronico livroEletronico1 = new LivroEletronico("Aventuras no Espaço", "Autor de Ficção", "Livro", 3, 
                                                               "Muito Bom", "Estante3", "PDF", 5, "PDF", 
                                                               "Requisitos mínimos: Leitor de PDF", "2023-09-08");
        System.out.println("Título do Livro Eletrônico: " + livroEletronico1.getTitulo());
        System.out.println("Formato do Livro Eletrônico: " + livroEletronico1.getFormato());
        System.out.println("Número total de licenças: " + livroEletronico1.getNumeroTotalLicencas());
        System.out.println("Requisitos de leitura: " + livroEletronico1.getRequisitosLeitura());
        System.out.println("Data de disponibilidade: " + livroEletronico1.getDataDisponibilidade());
        
        LivroEletronico livroEletronico2 = new LivroEletronico("A História da Ciência", "Carl Sagan", "Livro", 2, 
                                                               "Excelente", "Estante3", "ePub", 3, "ePub", 
                                                               "Requisitos mínimos: Leitor de ePub", "2023-09-15");
        System.out.println("Título do Livro Eletrônico: " + livroEletronico2.getTitulo());
        System.out.println("Formato do Livro Eletrônico: " + livroEletronico2.getFormato());
        System.out.println("Número total de licenças: " + livroEletronico2.getNumeroTotalLicencas());
        System.out.println("Requisitos de leitura: " + livroEletronico2.getRequisitosLeitura());
        System.out.println("Data de disponibilidade: " + livroEletronico2.getDataDisponibilidade());



        CD cd1 = new CD("Álbum de Rock Clássico", "Banda Clássica", "Música", 10, "Excelente", "Estante1", 
                       new String[]{"Bohemian Rhapsody", "Hotel California", "Stairway to Heaven"}, "50 minutos");
        System.out.println("Título do CD: " + cd1.getTitulo());
        System.out.println("Autor do CD: " + cd1.getAutor());
        System.out.println("Número de faixas: " + cd1.getListaFaixas().length);
        System.out.println("Duração total: " + cd1.getDuracaoTotal());

        CD cd2 = new CD("Álbum de Jazz", "Miles Davis", "Música", 8, "Ótimo", "Estante1", 
                       new String[]{"So What", "All Blues", "Blue in Green"}, "42 minutos");
        System.out.println("Título do CD: " + cd2.getTitulo());
        System.out.println("Autor do CD: " + cd2.getAutor());
        System.out.println("Número de faixas: " + cd2.getListaFaixas().length);
        System.out.println("Duração total: " + cd2.getDuracaoTotal());


        DVD dvd1 = new DVD("Filme de Ação", "Diretor Famoso", "Filme", 5, "Ótimo", "Estante2", 
                           "Brad Pitt, Angelina Jolie", "140 minutos", "Português, Inglês");
        System.out.println("Título do DVD: " + dvd1.getTitulo());
        System.out.println("Elenco do DVD: " + dvd1.getElenco());
        System.out.println("Duração do DVD: " + dvd1.getDuracao());
        System.out.println("Legendas disponíveis: " + dvd1.getLegendasAudioDisponiveis());

        DVD dvd2 = new DVD("Filme de Comédia", "Diretor Cômico", "Filme", 4, "Bom", "Estante2", 
                           "Jim Carrey, Jennifer Aniston", "96 minutos", "Português, Inglês");
        System.out.println("Título do DVD: " + dvd2.getTitulo());
        System.out.println("Elenco do DVD: " + dvd2.getElenco());
        System.out.println("Duração do DVD: " + dvd2.getDuracao());
        System.out.println("Legendas disponíveis: " + dvd2.getLegendasAudioDisponiveis());


        
    }
}
