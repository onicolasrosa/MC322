package src.core.entities.employees;

public abstract class Employee {
    private String nome;
    private int ID;
    private String endereco;
    private String contato;
    private String dataRegistro;
    private String login;
    private String password;

    protected Employee(String nome, int iD, String endereco, String contato, String dataRegistro, 
    String login, String password) {
        this.nome = nome;
        this.ID = iD;
        this.endereco = endereco;
        this.contato = contato;
        this.dataRegistro = dataRegistro;
        this.login = login;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int iD) {
        this.ID = iD;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
