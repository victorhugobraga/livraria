import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private final List<Livro> livros = new ArrayList<>();
    private final List<Autor> autores = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Biblioteca() {
        Autor georgeOrwell = new Autor("George Orwell", LocalDate.of(1903, 6, 25));
        Autor jKRowling = new Autor("J.K. Rowling", LocalDate.of(1965, 7, 31));
        autores.add(georgeOrwell);
        autores.add(jKRowling);

        livros.add(new Livro("1984", georgeOrwell, true));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", jKRowling, true));
    }

    public void listarLivrosDisponiveis() {
        if (livros.stream().noneMatch(Livro::getDisponivel)) {
            System.out.println("Nenhum livro disponível!");
            return;
        }

        for (Livro livro : livros) {
            if (livro.getDisponivel()) {
                System.out.printf("Id: %s%n", livro.getId());
                System.out.printf("Livro: \"%s\"%n", livro.getTitulo());
                System.out.printf("De: \"%s\"%n", livro.getAutor().getNome());
                System.out.printf("---%n");
            }
        }
    }

    public void registrarEmprestimo() {
        System.out.println("De qual livro deseja solicitar o empréstimo? (Informe apenas o Id completo)");
        String livroIdDesejado = scanner.next();

        Livro livroDesejado = null;
        for (Livro livro : livros) {
            if (livro.getId().toString().equals(livroIdDesejado)) {
                livroDesejado = livro;
            }
        }

        if (livroDesejado == null) {
            System.out.println("Nenhum livro identificado. Deseja tentar novamente? (SIM/NÃO)");
            String respostaNovaTentativa = scanner.next().toUpperCase();
            if (respostaNovaTentativa.equals("SIM")) registrarEmprestimo();
            else System.out.println("Empréstimo cancelado.");
        } else {
            System.out.println("Digite seu nome:");
            String nomeCliente = scanner.next();

            livros.get(livros.indexOf(livroDesejado)).setDisponivel(false);
            System.out.printf("Empréstimo registrado com sucesso do livro \"%s\" para o(a) %s.%n", livroDesejado.getTitulo(), nomeCliente);

            System.out.println("Deseja realizar um novo empréstimo? (SIM/NÃO)");
            String respostaNovaTentativa = scanner.next().toUpperCase();
            if (respostaNovaTentativa.equals("SIM")) registrarEmprestimo();
        }
    }

}
