package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		double a, b, c, conta, hip;
		
		Scanner ler = new Scanner(System.in);
        System.out.println("Informe os valores dos catetos");
        a=ler.nextDouble();
        b=ler.nextDouble();
        
        conta=Math.pow(a, 2) + Math.pow(b, 2);
        c= Math.pow(conta, 2);
        
        System.out.printf(" O valor da hipotenusa é %5.0f\n", c);
     
	}

}
