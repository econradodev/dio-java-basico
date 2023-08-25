import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de sua CONTA BANCÁRIA: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua AGÊNCIA: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o NOME E SOBRENOME DO CLIENTE: ");
        String nomeDoCliente = scanner.next(); 
        String sobrenomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o seu SALDO: ");
        double saldo = scanner.nextDouble();

        System.out.println (("Olá ").concat(nomeDoCliente).concat(" ").concat(sobrenomeDoCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ") + numeroDaConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
