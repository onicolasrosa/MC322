package src.employees;

public abstract class Employee {
    private String nome;
    private String ID;
    private String endereco;
    private String contato;
    private String dataRegistro;

    protected Employee(String nome, String ID, String endereco, String contato, String dataRegistro) {
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

    @Override
    public String toString() {
        String output = "";
        output += "Nome: " + getNome() + "\n";
        output += "ID: " + getID() + "\n";
        output += "Endereço: " + getEndereco() + "\n";
        output += "Contato: " + getContato() + "\n";
        output += "Data de Registro: " + getDataRegistro() + "\n";
        return output;
    }
}
