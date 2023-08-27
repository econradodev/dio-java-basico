import java.util.Scanner;

public class SaldoNaConta {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
  
        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        double saldoFinal = (saldoAtual + valorDeposito) - valorRetirada;
        
        System.out.println("Saldo atualizado na conta: " + saldoFinal);
      }
}