package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
        double a, b, c, conta,x1, x2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("insira o valor de a, b, c para calcular a equação");
		a = ler.nextDouble();
	    b = ler.nextDouble();
	    c = ler.nextDouble();

	    
	    conta= Math.pow(b, 2) - 4 * a * c;
	    x1 = (-b + Math.sqrt(conta))/ (2*a);
	    x2 = (-b - Math.sqrt(conta)) / (2*a);
	    
	    System.out.printf("O valor da baskara é:%5.0f\n", conta);
	    System.out.printf("O valor do X1 é:%5.0f\n", x1);
	    System.out.printf("O valor do X2 é:%5.0f", x2);

		    

	}

}
