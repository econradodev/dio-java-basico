import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();
        
        if (valorSaque <= saldoTotal) {
        int saldoDisponivel = saldoTotal - valorSaque;
        System.out.print ("Saque realizado com sucesso. Novo saldo: " + saldoDisponivel);
        } else {
        System.out.print ("Saldo insuficiente. Saque nao realizado!");
        }
    }
}
