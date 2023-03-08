package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
    
		double peso, qua, conta;
		
		Scanner ler = new Scanner(System.in);
    System.out.println("Insira a quantidade de ração em  kg: ");
    peso = ler.nextDouble();
    
    System.out.println("Insira a quantidade de ração em gramas: ");
    qua= ler.nextDouble();
    conta= peso - ((qua*2*5)/1000);
    
    System.out.printf("Quantidade de ração restante após 5 dias: %5.0f kilos\n",conta);
    
    
	}

}
