package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
    
				int n1, n2 , n3, p1, p2, p3;
				double mp;
				
				Scanner teclado = new Scanner(System.in);
				System.out.println("Digite o primeira nota");
				n1 = teclado.nextInt();
				System.out.println("Digite o segunda nota");
				n2 = teclado.nextInt();
				System.out.println("Digite o terceira nota");
				n3 = teclado.nextInt();
				
				System.out.println("Digite o primeiro peso");
				p1 = teclado.nextInt();
				System.out.println("Digite o segundo peso");
				p2 = teclado.nextInt();
				System.out.println("Digite o terceiro peso");
				p3 = teclado.nextInt();
			
				mp = ((n1* p1) + (n2* p2) + (n3* p3)) / (p1 + p2 + p3);
				System.out.printf("A média ponderada  é %d", n1, n2, n3,p1,p2,p3, mp);
			



				
	}

}
