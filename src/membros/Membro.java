package src.membros;

abstract class Membro {
    private String nome;
    private String ID;
    private String endereco;
    private String contato;
    private String dataRegistro;

    public Membro(String nome, String ID, String endereco, String contato, String dataRegistro) {
        this.nome = nome;
        this.ID = ID;
        this.endereco = endereco;
        this.contato = contato;
        this.dataRegistro = dataRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
