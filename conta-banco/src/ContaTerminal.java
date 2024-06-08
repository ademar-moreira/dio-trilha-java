
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta ! ");
        int conta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o número da Agência ! ");
        String agencia = scanner.next();
        scanner.nextLine(); 

        System.out.println("Digite o nome do cliente ! ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo ! ");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n\n", nomeCliente, agencia, conta, saldo);

    }
}