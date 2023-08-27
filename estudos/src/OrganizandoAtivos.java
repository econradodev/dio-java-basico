import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Organiza as strings em ordem alfabética e as imprime;

public class OrganizandoAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();

    // Entrada dos códigos dos ativos
    for (int i = 0; i <= quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }
    
    Collections.sort (ativos);
    
    for(int i=0; i< ativos.size() ; i++){
        System.out.print (ativos.get(i) + '\n');
    }

  }
}
