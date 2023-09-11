package src.repositorio;

public class EnumValues {
    enum ItemHeader {
        classe, titulo, autor, categoria, estadoConservacao, localizacao, codigoSerial, disponivel, 
        listaFaixas, duracaoTotal, elenco, legendasAudioDisponiveis, isbn, edicao, 
        formatoArquivo, requisitosLeitura, dataDisponibilidade, tipoRecurso;
    }
    enum MembrosHeader {
        classe, nome;
    }
    enum ServicosHeader {
        classe, protocolo;
    }
    enum FuncionariosHeader {
        classe, cargo;
    }
    enum GestaoHeader {
        classe, acao;
    }
}
