<<<<<<< HEAD
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê agência e número da conta como String, mantendo zeros e hífen
        System.out.println("Por favor, digite o número da Conta (ex: 0632-2):");
        String contaCompleta = scanner.nextLine();

        // Lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Lê saldo inicial
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = 0;
        try {
            saldo = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor de saldo inválido. Definindo como 0.");
        }

        // Mensagem de saída simulando um banco
        System.out.println("\nOlá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. " +
                "Sua conta " + contaCompleta + " já está ativa e seu saldo de R$ " + saldo + " disponível para saque.");

        scanner.close();
=======
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
>>>>>>> 75552fecc6b0d3d3c5f8ac97f8a6be412c925640
    }
}
