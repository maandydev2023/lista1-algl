package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
     
		double vr, kws, valork, valorp,valorb, valora;
		
		Scanner ler =new Scanner(System.in);
		System.out.println("Informe o valor de referência: ");
		vr = ler.nextDouble();
		
		
		
		System.out.println("Insira a quantidade de kilowatt:");
		kws = ler.nextDouble();
		
		valork = vr * 0.2;
		valorp = kws * valork;
		valorb = valorp - (valorp * (17.0 / 100));
		valora = (10 * 0.005) * valorp + valorp;
		
		System.out.printf("O valor de cada kw é: R$%5.2f\n", valork);
		System.out.printf("O valor a ser pago  é: R$%5.2f\n", valorp);
		System.out.printf("O valor a ser pago com bônus é: R$%5.2f\n", valorb);
		System.out.printf("O valor a ser pago com juros de atraso é: R$%5.2f\n", valora);
		
	}

}
