package src;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import src.itensMultimidia.CD;
import src.itensMultimidia.DVD;
import src.itensMultimidia.LivroEletronico;
import src.itensMultimidia.LivroFisico;
import src.itensMultimidia.RecursoMultimidia;
import src.itensMultimidia.RepositorioItens;


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        LivroFisico livroFisico1 = new LivroFisico("Dom Quixote", "Miguel de Cervantes", "Livro Clássico", 5, "Bom", "Estante4", 
                                                   "ISBN123456", "1ª Edição");
        System.out.println("Título do Livro Físico: " + livroFisico1.getTitulo());
        System.out.println("ISBN do Livro Físico: " + livroFisico1.getIsbn());
        System.out.println("Edição do Livro Físico: " + livroFisico1.getEdicao());
        System.out.println("-------------------------------------------------------------------------------------");

        LivroFisico livroFisico2 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", "Livro de Fantasia", 7, "Bom", "Estante4", 
                                                   "ISBN9780345339706", "Edição Especial");
        System.out.println("Título do Livro Físico: " + livroFisico2.getTitulo());
        System.out.println("ISBN do Livro Físico: " + livroFisico2.getIsbn());
        System.out.println("Edição do Livro Físico: " + livroFisico2.getEdicao());
        System.out.println("-------------------------------------------------------------------------------------");


        LivroEletronico livroEletronico1 = new LivroEletronico("Aventuras no Espaço", "Autor de Ficção", "Livro", 3, 
                                                               "Muito Bom", "Estante3", "PDF", 5, "PDF", 
                                                               "Requisitos mínimos: Leitor de PDF", "2023-09-08");
        System.out.println("Título do Livro Eletrônico: " + livroEletronico1.getTitulo());
        System.out.println("Formato do Livro Eletrônico: " + livroEletronico1.getFormato());
        System.out.println("Número total de licenças: " + livroEletronico1.getNumeroTotalLicencas());
        System.out.println("Requisitos de leitura: " + livroEletronico1.getRequisitosLeitura());
        System.out.println("Data de disponibilidade: " + livroEletronico1.getDataDisponibilidade());
        System.out.println("-------------------------------------------------------------------------------------");
        
        LivroEletronico livroEletronico2 = new LivroEletronico("A História da Ciência", "Carl Sagan", "Livro", 2, 
                                                               "Excelente", "Estante3", "ePub", 3, "ePub", 
                                                               "Requisitos mínimos: Leitor de ePub", "2023-09-15");
        System.out.println("Título do Livro Eletrônico: " + livroEletronico2.getTitulo());
        System.out.println("Formato do Livro Eletrônico: " + livroEletronico2.getFormato());
        System.out.println("Número total de licenças: " + livroEletronico2.getNumeroTotalLicencas());
        System.out.println("Requisitos de leitura: " + livroEletronico2.getRequisitosLeitura());
        System.out.println("Data de disponibilidade: " + livroEletronico2.getDataDisponibilidade());
        System.out.println("-------------------------------------------------------------------------------------");



        CD cd1 = new CD("Álbum de Rock Clássico", "Banda Clássica", "Música", 10, "Excelente", "Estante1", 
                       new String[]{"Bohemian Rhapsody", "Hotel California", "Stairway to Heaven"}, "50 minutos");
        System.out.println("Título do CD: " + cd1.getTitulo());
        System.out.println("Autor do CD: " + cd1.getAutor());
        System.out.println("Número de faixas: " + cd1.getListaFaixas().length);
        System.out.println("Duração total: " + cd1.getDuracaoTotal());
        System.out.println("-------------------------------------------------------------------------------------");

        CD cd2 = new CD("Álbum de Jazz", "Miles Davis", "Música", 8, "Ótimo", "Estante1", 
                       new String[]{"So What", "All Blues", "Blue in Green"}, "42 minutos");
        System.out.println("Título do CD: " + cd2.getTitulo());
        System.out.println("Autor do CD: " + cd2.getAutor());
        System.out.println("Número de faixas: " + cd2.getListaFaixas().length);
        System.out.println("Duração total: " + cd2.getDuracaoTotal());
        System.out.println("-------------------------------------------------------------------------------------");


        DVD dvd1 = new DVD("Filme de Ação", "Diretor Famoso", "Filme", 5, "Ótimo", "Estante2", 
                           "Brad Pitt, Angelina Jolie", "140 minutos", "Português, Inglês");
        System.out.println("Título do DVD: " + dvd1.getTitulo());
        System.out.println("Elenco do DVD: " + dvd1.getElenco());
        System.out.println("Duração do DVD: " + dvd1.getDuracao());
        System.out.println("Legendas disponíveis: " + dvd1.getLegendasAudioDisponiveis());
        System.out.println("-------------------------------------------------------------------------------------");

        DVD dvd2 = new DVD("Filme de Comédia", "Diretor Cômico", "Filme", 4, "Bom", "Estante2", 
                           "Jim Carrey, Jennifer Aniston", "96 minutos", "Português, Inglês");
        System.out.println("Título do DVD: " + dvd2.getTitulo());
        System.out.println("Elenco do DVD: " + dvd2.getElenco());
        System.out.println("Duração do DVD: " + dvd2.getDuracao());
        System.out.println("Legendas disponíveis: " + dvd2.getLegendasAudioDisponiveis());
        System.out.println("-------------------------------------------------------------------------------------");


        RecursoMultimidia recurso1 = new RecursoMultimidia("Apresentação em Slides", "Autor da Apresentação", "Educação", 5, "Bom", "Estante5", "Slides", "PPT");
        System.out.println("Recurso Multimídia1:");
        System.out.println("Título do Recurso: " + recurso1.getTitulo());
        System.out.println("Autor do Recurso: " + recurso1.getAutor());
        System.out.println("Categoria do Recurso: " + recurso1.getCategoria());
        System.out.println("Formato do Recurso: " + recurso1.getFormato());
        System.out.println("Localização do Recurso: " + recurso1.getLocalizacao());
        System.out.println("Estado de Conservação do Recurso: " + recurso1.getEstadoConservacao());
        System.out.println("-------------------------------------------------------------------------------------");

        RecursoMultimidia recurso2 = new RecursoMultimidia("Tutorial em Vídeo", "Instrutor de Vídeo", "Educação", 3, "Excelente", "Estante6", "Vídeo", "MP4");
        System.out.println("Recurso Multimídia2:");
        System.out.println("Título do Recurso: " + recurso2.getTitulo());
        System.out.println("Autor do Recurso: " + recurso2.getAutor());
        System.out.println("Categoria do Recurso: " + recurso2.getCategoria());
        System.out.println("Formato do Recurso: " + recurso2.getFormato());
        System.out.println("Localização do Recurso: " + recurso2.getLocalizacao());
        System.out.println("Estado de Conservação do Recurso: " + recurso2.getEstadoConservacao());
        System.out.println("-------------------------------------------------------------------------------------");
    
        ArrayList<LivroFisico> livros = new ArrayList<>();
        livros.add(livroFisico1);
        livros.add(livroFisico2);

        RepositorioItens repItens = new RepositorioItens();
        for (LivroFisico livro : livros) {
            repItens.write_object(livro);
        }



    

    }
}
