package BIBLIOTECA;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Criar usuários
        Usuario usuario1 = new Usuario("João", "12345678901", 25, 1);
        Usuario usuario2 = new Usuario("Maria", "98765432101", 30, 2);

        // Criar funcionários
        Funcionario funcionario1 = new Funcionario("Carlos", "11122233344", 35, 101, "Bibliotecário");
        Funcionario funcionario2 = new Funcionario("Ana", "44455566677", 28, 102, "Atendente");

        // Criar livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1ª edição", 1954, "Fantasia");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "1ª edição", 1997, "Fantasia");

        // Exemplo de exibição de informações
        System.out.println("Usuários da biblioteca:");
        for (Usuario usuario : biblioteca.getUsuarios()) {
            System.out.println(usuario.getNome());
        }

        System.out.println("\nFuncionários da biblioteca:");
        for (Funcionario funcionario : biblioteca.getFuncionarios()) {
            System.out.println(funcionario.getNome());
        }

        System.out.println("\nLivros da biblioteca:");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.getTitulo() + " - " + livro.getSituacao());
        }
    }
}
