import java.time.LocalDate;
import java.util.UUID;

public class Autor {

    private final UUID id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(String nome, LocalDate dataNascimento) {
        id = UUID.randomUUID();

        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
