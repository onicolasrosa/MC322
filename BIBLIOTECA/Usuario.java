package BIBLIOTECA;

public class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private int tefelone;
    private Livro[] livrosReservados;

    public Usuario(String nome, String cpf, int idade, int tefelone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.tefelone = tefelone;
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

    public int getTefelone() {
        return tefelone;
    }

    public void setTefelone(int tefelone) {
        this.tefelone = tefelone;
    }

    public Livro[] getLivrosReservados() {
        return livrosReservados;
    }
}