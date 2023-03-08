package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		int anoa, anon, idade, datan, dataa, ano;
		
		Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o ano do nascimento:");
		    anon= ler.nextInt();
		    
		    System.out.println("Informe o ano atual:");
		    anoa= ler.nextInt();
		    idade=(anoa-anon);
		    
		    dataa=2050-anon;
		    ano=dataa*365;
		    
		    System.out.printf("A idade da pessoa é: %d\n", idade);
		    System.out.printf("Terá vivido: %d\n",ano);
		    
	}

}
