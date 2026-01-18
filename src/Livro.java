import java.time.LocalDate;
import java.util.UUID;

public class Livro {

    private final UUID id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;

    private LocalDate dataAutalizacao;

    public Livro(String titulo, Autor autor, boolean disponivel) {
        setTitulo(titulo);
        setAutor(autor);
        setDisponivel(disponivel);

        id = UUID.randomUUID();
        LocalDate dataCadastro = LocalDate.now();
        setDataAutalizacao();
    }

    private void setDataAutalizacao() {
        dataAutalizacao = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        setDataAutalizacao();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
        setDataAutalizacao();
    }

    public Autor getAutor() {
        return autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        setDataAutalizacao();
    }

    public boolean getDisponivel() {
        return disponivel;
    }
}
