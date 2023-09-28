package src.core.entities.infrastructure;

public class Equipments {
    public enum CategoriaEquipamento {
        INFORMATICA, AUDIOVISUAL, IMPRESSAO
    }
    
    private CategoriaEquipamento categoria;

    public Equipments(CategoriaEquipamento categoria) {
        this.categoria = categoria;
    }

    public CategoriaEquipamento getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaEquipamento categoria) {
        this.categoria = categoria;
    }

    public class Informatica {
        private String nome;
        private String modelo;
        private String descricao;

        public Informatica(String nome, String modelo, String descricao) {
            this.nome = nome;
            this.modelo = modelo;
            this.descricao = descricao;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }

    public class Audiovisual {
        private String nome;
        private String tipo;
        private String descricao;

        public Audiovisual(String nome, String tipo, String descricao) {
            this.nome = nome;
            this.tipo = tipo;
            this.descricao = descricao;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }

    public class Impressao {
        private String nome;
        private String tipo;
        private String descricao;

        public Impressao(String nome, String tipo, String descricao) {
            this.nome = nome;
            this.tipo = tipo;
            this.descricao = descricao;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }
}

