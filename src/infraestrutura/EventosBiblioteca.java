package src.infraestrutura;

public class EventosBiblioteca {
    public enum TipoDeEvento {
        PALESTRA, WORKSHOP, EXPOSICAO
    }

    private TipoDeEvento tipo;
    private String topico;
    private String data;
    private String horario;
    private String local;

    public EventosBiblioteca(TipoDeEvento tipo, String topico, String data, String horario, String local) {
        this.tipo = tipo;
        this.topico = topico;
        this.data = data;
        this.horario = horario;
        this.local = local;
    }

    public TipoDeEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeEvento tipo) {
        this.tipo = tipo;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public class Palestra {
        private String palestrante;

        public Palestra(String palestrante) {
            this.palestrante = palestrante;
        }

        public String getPalestrante() {
            return palestrante;
        }

        public void setPalestrante(String palestrante) {
            this.palestrante = palestrante;
        }
    }

    public class Workshop {
        private String instrutor;
        private String materiaisNecessarios;

        public Workshop(String instrutor, String materiaisNecessarios) {
            this.instrutor = instrutor;
            this.materiaisNecessarios = materiaisNecessarios;
        }

        public String getInstrutor() {
            return instrutor;
        }

        public void setInstrutor(String instrutor) {
            this.instrutor = instrutor;
        }

        public String getMateriaisNecessarios() {
            return materiaisNecessarios;
        }

        public void setMateriaisNecessarios(String materiaisNecessarios) {
            this.materiaisNecessarios = materiaisNecessarios;
        }
    }

    public class Exposicao {
        private String expositores;
        private String duracao;

        public Exposicao(String expositores, String duracao) {
            this.expositores = expositores;
            this.duracao = duracao;
        }

        public String getExpositores() {
            return expositores;
        }

        public void setExpositores(String expositores) {
            this.expositores = expositores;
        }

        public String getDuracao() {
            return duracao;
        }

        public void setDuracao(String duracao) {
            this.duracao = duracao;
        }
    }
}
