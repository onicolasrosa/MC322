package src;

import java.io.IOException;
import java.util.ArrayList;

import src.itensMultimidia.CD;
import src.itensMultimidia.DVD;
import src.itensMultimidia.LivroEletronico;
import src.itensMultimidia.LivroFisico;
import src.itensMultimidia.RecursoMultimidia;
import src.itensMultimidia.RepositorioItens;


public class Main {
    public static void main(String[] args) throws IOException{
        LivroFisico livroFisico1 = new LivroFisico("Dom Quixote", "Miguel de Cervantes", "Livro Clássico", "Bom", "Estante4", 
                                                   "AAAA0000", "ISBN123456", "1ª Edição");
        System.out.println("Título do Livro Físico: " + livroFisico1.getTitulo());
        System.out.println("ISBN do Livro Físico: " + livroFisico1.getIsbn());
        System.out.println("Edição do Livro Físico: " + livroFisico1.getEdicao());
        System.out.println("-------------------------------------------------------------------------------------");

        LivroFisico livroFisico2 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", "Livro de Fantasia", "Bom", "Estante4", 
                                                   "AAAA0000", "ISBN9780345339706", "Edição Especial");
        System.out.println("Título do Livro Físico: " + livroFisico2.getTitulo());
        System.out.println("ISBN do Livro Físico: " + livroFisico2.getIsbn());
        System.out.println("Edição do Livro Físico: " + livroFisico2.getEdicao());
        System.out.println("-------------------------------------------------------------------------------------");


        LivroEletronico livroEletronico1 = new LivroEletronico("Aventuras no Espaço", "Autor de Ficção", "Ficção", 
                                                               "Excelente", "Estante3", "AAAA0000", "Primeira", "PDF", 
                                                               "Requisitos mínimos: Leitor de PDF", "2023-09-08");
        System.out.println("Título do Livro Eletrônico: " + livroEletronico1.getTitulo());
        System.out.println("Requisitos de leitura: " + livroEletronico1.getRequisitosLeitura());
        System.out.println("Data de disponibilidade: " + livroEletronico1.getDataDisponibilidade());
        System.out.println("-------------------------------------------------------------------------------------");
        
        LivroEletronico livroEletronico2 = new LivroEletronico("A História da Ciência", "Carl Sagan", "Livro", 
                                                               "Excelente", "Estante3", "AAAA0000", "Primeira", "ePub", 
                                                               "Requisitos mínimos: Leitor de ePub", "2023-09-15");
        System.out.println("Título do Livro Eletrônico: " + livroEletronico2.getTitulo());
        System.out.println("Requisitos de leitura: " + livroEletronico2.getRequisitosLeitura());
        System.out.println("Data de disponibilidade: " + livroEletronico2.getDataDisponibilidade());
        System.out.println("-------------------------------------------------------------------------------------");



        CD cd1 = new CD("Álbum de Rock Clássico", "Banda Clássica", "Música", "Excelente", "Estante1", 
                       "AAAA0000", "Bohemian Rhapsody; Hotel California; Stairway to Heaven", "50 minutos");
        System.out.println("Título do CD: " + cd1.getTitulo());
        System.out.println("Autor do CD: " + cd1.getAutor());
        System.out.println("Número de faixas: " + cd1.getListaFaixas().size());
        System.out.println("Duração total: " + cd1.getDuracaoTotal());
        System.out.println("-------------------------------------------------------------------------------------");

        CD cd2 = new CD("Álbum de Jazz", "Miles Davis", "Música", "Ótimo", "Estante1", 
                       "AAAA0000", "So What; All Blues; Blue in Green", "42 minutos");
        System.out.println("Título do CD: " + cd2.getTitulo());
        System.out.println("Autor do CD: " + cd2.getAutor());
        System.out.println("Número de faixas: " + cd2.getListaFaixas().size());
        System.out.println("Duração total: " + cd2.getDuracaoTotal());
        System.out.println("-------------------------------------------------------------------------------------");


        DVD dvd1 = new DVD("Filme de Ação", "Diretor Famoso", "Filme", "Ótimo", "Estante2", 
                           "AAAA0000", "Brad Pitt; Angelina Jolie", "140 minutos", "Português, Inglês");
        System.out.println("Título do DVD: " + dvd1.getTitulo());
        System.out.println("Elenco do DVD: " + dvd1.getElenco());
        System.out.println("Duração do DVD: " + dvd1.getDuracaoTotal());
        System.out.println("Legendas disponíveis: " + dvd1.getLegendasAudioDisponiveis());
        System.out.println("-------------------------------------------------------------------------------------");

        DVD dvd2 = new DVD("Filme de Comédia", "Diretor Cômico", "Filme", "Bom", "Estante2", 
                           "AAAA0000", "Jim Carrey; Jennifer Aniston", "96 minutos", "Português, Inglês");
        System.out.println("Título do DVD: " + dvd2.getTitulo());
        System.out.println("Elenco do DVD: " + dvd2.getElenco());
        System.out.println("Duração do DVD: " + dvd2.getDuracaoTotal());
        System.out.println("Legendas disponíveis: " + dvd2.getLegendasAudioDisponiveis());
        System.out.println("-------------------------------------------------------------------------------------");


        RecursoMultimidia recurso1 = new RecursoMultimidia("Apresentação em Slides", "Autor da Apresentação", "Educação", "Bom", "Estante5", 
                                                            "AAAA0000", "Slides", "PPT");
        System.out.println("Recurso Multimídia1:");
        System.out.println("Título do Recurso: " + recurso1.getTitulo());
        System.out.println("Autor do Recurso: " + recurso1.getAutor());
        System.out.println("Categoria do Recurso: " + recurso1.getCategoria());
        System.out.println("Formato do Recurso: " + recurso1.getFormatoArquivo());
        System.out.println("Localização do Recurso: " + recurso1.getLocalizacao());
        System.out.println("Estado de Conservação do Recurso: " + recurso1.getEstadoConservacao());
        System.out.println("-------------------------------------------------------------------------------------");

        RecursoMultimidia recurso2 = new RecursoMultimidia("Tutorial em Vídeo", "Instrutor de Vídeo", "Educação", "Excelente", "Estante6",
                                                            "AAAA0000", "Vídeo", "MP4");
        System.out.println("Recurso Multimídia2:");
        System.out.println("Título do Recurso: " + recurso2.getTitulo());
        System.out.println("Autor do Recurso: " + recurso2.getAutor());
        System.out.println("Categoria do Recurso: " + recurso2.getCategoria());
        System.out.println("Formato do Recurso: " + recurso2.getFormatoArquivo());
        System.out.println("Localização do Recurso: " + recurso2.getLocalizacao());
        System.out.println("Estado de Conservação do Recurso: " + recurso2.getEstadoConservacao());
        System.out.println("-------------------------------------------------------------------------------------");
    
        ArrayList<Object> itens = new ArrayList<>();
        itens.add(livroFisico1);
        itens.add(livroFisico2);
        itens.add(livroEletronico1);
        itens.add(livroEletronico2);
        itens.add(cd1);
        itens.add(cd2);
        itens.add(dvd1);
        itens.add(dvd2);
        itens.add(recurso1);
        itens.add(recurso2);
        
        
        RepositorioItens repItens = new RepositorioItens();        
        repItens.writeItem(itens);
        ArrayList<ArrayList<String>> todosItens = repItens.readItems();
        
        //System.out.println(todosItens);
        for(ArrayList<String> item : todosItens) {
            System.out.println(item);
        }
        
    }
}
