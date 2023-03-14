package lista2;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner (System.in);
		

	      System.out.print("Digite o primeiro número: ");
	      int num1 = ler.nextInt();

	      System.out.print("Digite o segundo número: ");
	      int num2 = ler.nextInt();

	      System.out.print("Digite o terceiro número: ");
	      int num3 = ler.nextInt();

	      int menor = num1;
	      if (num2 < menor &&  num3<menor) {
	    	  menor=num2;
	    	  menor=num3;
	      }
	         System.out.println("O menor número é: " + menor);
	      }

}
	   
	
		

		
	


