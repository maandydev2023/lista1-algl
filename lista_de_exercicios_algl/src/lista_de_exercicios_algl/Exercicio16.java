package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
    double po, jar, mi, contapo, contajar, contami;
    
	Scanner ler = new Scanner(System.in);
    System.out.println("Insira a medida em pés para polegadas:");
    po=ler.nextDouble();
    
    System.out.println("Insira a medida em pés para jardas:");
    jar=ler.nextDouble();
    
    System.out.println("Insira a medida em pés para milhas:");
    mi=ler.nextDouble();
    
    contapo= po*12;
    contajar = jar*36;
    contami = po*48.88;
    
    System.out.printf(" O valor em Polegadas é: %5.0f\n", contapo);
    System.out.printf(" O valor em Jardas é: %5.0f\n", contajar);
    System.out.printf(" O valor em Milhas é: %5.0f\n", contami);
	}

}
