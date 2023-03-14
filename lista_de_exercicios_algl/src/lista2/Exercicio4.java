package lista2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
  
		
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Informe um número de 1 a 30:" );
		 int contador =ler.nextInt();
		 
		 
		 if(contador <30) {
			 System.out.println("Esta na faixa ");
				 
			 }else {
				 System.out.println("Digite um número entre 1 e 30.");
			 }
			 
				 
	}

}
