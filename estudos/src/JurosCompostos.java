import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        for (int i = 0; i < periodo; i++) {
          valorFinal += valorFinal * taxaJuros;
        }

        DecimalFormat df = new DecimalFormat("####.00");
        
        System.out.print ("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}