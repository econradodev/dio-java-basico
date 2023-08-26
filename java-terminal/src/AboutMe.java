import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class AboutMe {
  
    public static void main(String[] args) {
        //criando o objeto scanner
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();  

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm");
        } catch (InputMismatchException e) {
            System.out.println("Os campos IDADE e ALTURA precisam ser numéricos.");
        }
    }

 }
