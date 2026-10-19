
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chamado chamado1 = new Chamado(1, "Computador nao liga");
        Chamado chamado2 = new Chamado(2, "Problema no sistema");
        Chamado chamado3 = new Chamado(3, "Teclado nao funciona");

        System.out.println("=== CHAMADOS CRIADOS ===");
        chamado1.exibirChamado();
        System.out.println();

        chamado2.exibirChamado();
        System.out.println();

        chamado3.exibirChamado();
        System.out.println();

        System.out.println("Total de chamados: "
                + Chamado.getTotalChamados());

        try {
            System.out.print("Digite o numero de um chamado: ");
            int numero = Integer.parseInt(scanner.nextLine());

            System.out.println("Voce digitou o chamado numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um numero inteiro valido.");
        }

        scanner.close();
    }
}