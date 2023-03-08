package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	        
	        System.out.print("Digite o valor em dias: ");
	        int dias = ler.nextInt();
	        
	        int horas = dias * 24;
	        int meses = dias / 30;
	        int trimestres = meses / 3;
	        int semestres = meses / 6;
	        int anos = meses / 12;
	        int decadas = anos / 10;
	        
	        System.out.printf("%d dias equivalem a:\n", dias);
	        System.out.printf("%d horas\n", horas);
	        System.out.printf("%d meses\n", meses);
	        System.out.printf("%d trimestres\n", trimestres);
	        System.out.printf("%d semestres\n", semestres);
	        System.out.printf("%d anos\n", anos);
	        System.out.printf("%d décadas\n", decadas);
	    
	
}

}
