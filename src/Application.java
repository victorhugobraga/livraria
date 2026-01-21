import java.util.Scanner;

public class Application {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        String resposta;

        System.out.println("Bem-vindo à Biblioteca!");
        do {
            System.out.println("Deseja ver a lista de livros disponíveis? (SIM/NÃO)");
            resposta = scanner.next().toUpperCase();

            if (!resposta.equals("SIM")) break;

            biblioteca.listarLivrosDisponiveis();

            System.out.println("Deseja registrar um empréstimo? (SIM/NÃO)");
            String respostaEmprestimo = scanner.next().toUpperCase();

            if (respostaEmprestimo.equals("SIM")) {
                biblioteca.registrarEmprestimo();
            }

            System.out.println("Gostaria de fazer outra consulta? (SIM/NÃO)");
            resposta = scanner.next().toUpperCase();

        } while (resposta.equals("SIM"));

        scanner.close();
        System.out.println("Obrigado por visitar a Biblioteca!");
    }
}
