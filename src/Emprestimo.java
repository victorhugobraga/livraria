import java.time.LocalDate;
import java.util.UUID;

public class Emprestimo {

    private final UUID id;
    private Livro livro;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = UUID.randomUUID();

        setLivro(livro);
        setNomeCliente(nomeCliente);
        setDataEmprestimo(dataEmprestimo);
        setDataDevolucao(dataDevolucao);
    }

    public UUID getId() {
        return id;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}
