public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        
        Livro livro1 = new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996, 59.90);
        Livro livro2 = new Livro("A Fúria dos Reis", "George R. R. Martin", 1998, 62.50);
        Livro livro3 = new Livro("A Tormenta de Espadas", "George R. R. Martin", 2000, 66.90);
        Livro livro4 = new Livro("O Festim dos Corvos", "George R. R. Martin", 2005, 70.00);
        Livro livro5 = new Livro("A Dança dos Dragões", "George R. R. Martin", 2011, 75.00);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        biblioteca.listarLivrosDisponiveis();

        System.out.println("\n--- EMPRÉSTIMO ---");
        Livro buscado = biblioteca.buscarLivroPorTitulo("A Guerra dos Tronos");
        if (buscado != null) {
            buscado.emprestar();
        }

        biblioteca.listarLivrosDisponiveis();

        System.out.println("\n--- DEVOLUÇÃO ---");
        buscado.devolver();

        System.out.println("\n--- DESCONTO ---");
        livro5.aplicarDesconto(15);


        int anoAtual = 2025;
        System.out.println("Idade do livro '" + livro2.getTitulo() + "': " +
                livro2.obterIdade(anoAtual) + " anos");

        System.out.println("\nValor total dos livros: R$ " + biblioteca.calcularValorTotal());
    }
}
