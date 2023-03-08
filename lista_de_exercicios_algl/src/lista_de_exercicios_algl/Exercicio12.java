package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
     
		double altd, altc, conta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a altura do degrau em centimetros:");
		altd=ler.nextDouble();
		
		System.out.println("Insira a altura desejada em metros:");
		altc=ler.nextDouble();
		
		conta=(altc*100)/altd;
		System.out.printf("A quantidade de graus nescessária será: %5.0f degraus", conta);
		

	}

}
