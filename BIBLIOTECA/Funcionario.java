package BIBLIOTECA;

public class Funcionario {
    private String nome;
    private String cpf;
    private int idade;
    private int tefelone;
    private String cargo;

    public Funcionario(String nome, String cpf, int idade, int tefelone, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.tefelone = tefelone;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int gettefelone() {
        return tefelone;
    }

    public void settefelone(int tefelone) {
        this.tefelone = tefelone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}