package src.core.entities.infrastructure;

public class Multimedia {
    public enum FormatoMultimidia {
        AUDIO, VIDEO, SOFTWARE
    }
    private FormatoMultimidia formato;

    public Multimedia(FormatoMultimidia formato) {
        this.formato = formato;
    }

    public FormatoMultimidia getFormato() {
        return formato;
    }
    public void setFormato(FormatoMultimidia formato) {
        this.formato = formato;
    }

    public class Audio {
        private String titulo;
        private int duracaoMinutos;

        public Audio(String titulo, int duracaoMinutos) {
            this.titulo = titulo;
            this.duracaoMinutos = duracaoMinutos;
        }

        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getDuracaoMinutos() {
            return duracaoMinutos;
        }
        public void setDuracaoMinutos(int duracaoMinutos) {
            this.duracaoMinutos = duracaoMinutos;
        }
    }

    public class Video {
        private String titulo;
        private int duracaoMinutos;

        public Video(String titulo, int duracaoMinutos) {
            this.titulo = titulo;
            this.duracaoMinutos = duracaoMinutos;
        }

        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getDuracaoMinutos() {
            return duracaoMinutos;
        }
        public void setDuracaoMinutos(int duracaoMinutos) {
            this.duracaoMinutos = duracaoMinutos;
        }
    }

    public class Software {
        private String nome;
        private String versao;

        public Software(String nome, String versao) {
            this.nome = nome;
            this.versao = versao;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getVersao() {
            return versao;
        }
        public void setVersao(String versao) {
            this.versao = versao;
        }
    }
}

