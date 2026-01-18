import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        Autor georgeOrwell = new Autor("George Orwell", LocalDate.of(1903, 6, 25));
        Autor jKRowling = new Autor("J.K. Rowling", LocalDate.of(1965, 7, 31));
        autores.add(georgeOrwell);
        autores.add(jKRowling);

        livros.add(new Livro("1984", georgeOrwell, true));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", jKRowling, false));
    }
}
