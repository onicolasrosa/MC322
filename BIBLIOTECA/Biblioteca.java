package BIBLIOTECA;

public class Biblioteca {
    private String nome;
    private Usuario[] usuarios;
    private Funcionario[] funcionarios;
    private Livro[] livros;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Métodos de acesso aos usuários, funcionários e livros
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public Livro[] getLivros() {
        return livros;
    }

}