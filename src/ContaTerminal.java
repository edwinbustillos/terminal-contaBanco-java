import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        try {
             new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        printLine();
        System.out.println("BANCO XYZ - CRIAÇÃO DE CONTA");
        printLine();
        System.out.println();
        System.out.println("Olá, seja bem-vindo ao Banco XYZ, para criar uma conta, por favor, preencha os dados abaixo:");
        System.out.println();
 
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.close();
        ContaBanco contaBanco = new ContaBanco(numero, agencia, nomeCliente, saldo);
        
        System.out.println();
        printLine();
        System.out.println("Olá " + contaBanco.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaBanco.agencia + ", conta " + contaBanco.numero + " e seu saldo " + contaBanco.saldo + " já está disponível para saque.");
        System.out.println();
    }

    public static void printLine() {
        for (int i = 0; i < 150; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}