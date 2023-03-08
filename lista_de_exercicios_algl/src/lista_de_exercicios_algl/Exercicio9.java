package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
    //x2-5x+6=o utilizado formula de baskara
		
		double a, b, c, bask, x1, x2;
		
		Scanner ler = new Scanner(System.in);
		
		a = 1;
	    b = -5;
	    c = 6;
	    
	    bask = Math.pow(b, 2) - 4 * a * c;
	    x1 = (-b + Math.sqrt(bask))/ (2*a);
	    x2 = (-b - Math.sqrt(bask)) / (2*a);
	    
	    System.out.printf("O valor da baskara é:%5.0f\n", bask);
	    System.out.printf("O valor do X1 é:%5.0f\n", x1);
	    System.out.printf("O valor do X2 é:%5.0f\n", x2);

		    
		    
		    
		    
	}
}
