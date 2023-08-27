import java.util.Scanner;
import java.text.DecimalFormat;

public class DepositoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        
        DecimalFormat df = new DecimalFormat("####.00");

        if (valor > 0) {
          System.out.print ("Deposito realizado com sucesso! \n Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
          System.out.print ("Encerrando o programa...");
        } else {
          System.out.print ("Valor invalido! Digite um valor maior que zero.");
        }
    }
}