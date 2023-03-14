package lista2;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
      
		 Scanner ler = new Scanner(System.in);

	      System.out.print("Digite o valor do saque: ");
	      int valorSaque = ler.nextInt();

	      int notas100 = valorSaque / 100;
	      int notas50 = (valorSaque % 100) / 50;
	      int notas20 = ((valorSaque % 100) % 50) / 20;
	      int notas10 = (((valorSaque % 100) % 50) % 20) / 10;
	      int notas5 = ((((valorSaque % 100) % 50) % 20) % 10) / 5;
	      int notas2 = (((((valorSaque % 100) % 50) % 20) % 10) % 5) / 2;

	      System.out.println("Quantidade de notas:");
	      System.out.println("Notas de 100: " + notas100);
	      System.out.println("Notas de 50: " + notas50);
	      System.out.println("Notas de 20: " + notas20);
	      System.out.println("Notas de 10: " + notas10);
	      System.out.println("Notas de 5: " + notas5);
	      System.out.println("Notas de 2: " + notas2);

	}

}
