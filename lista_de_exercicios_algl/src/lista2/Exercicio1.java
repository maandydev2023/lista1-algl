package lista2;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	
		 
	      System.out.print("Digite o primeiro número: ");
	      int num1 = ler.nextInt();

	      System.out.print("Digite o segundo número: ");
	      int num2 = ler.nextInt();

	      if (num1 > num2) {
	         System.out.println("O primeiro número é maior.");
	      } else if (num2 > num1) {
	         System.out.println("O segundo número é maior.");
	      } else {
	         System.out.println("Os números são iguais.");
	      }

	     
	   }



}
