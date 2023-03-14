package lista2;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe 3 valores:" );
		int valor1 =ler.nextInt();
		int valor2 =ler.nextInt();
		int valor3 =ler.nextInt();

		if(valor3>valor1 && valor3<valor2) {
			System.out.println("O terceiro valor está entre o primeiro valor.");
			
		}else {
			System.out.println("O terceiro valor NÃO está entre o primeiro e o segundo valor.");
		}
		
	}

}
