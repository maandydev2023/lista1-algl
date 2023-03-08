package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		double sa, valor, valor1,saf, cont1, cont2, valor2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o valor do salário:");
		sa=ler.nextDouble();
		
		System.out.println("Insira o valor da primeira conta:");
		valor1=ler.nextDouble();
		
		System.out.println("Insira o valor da segunda conta:");
		valor2=ler.nextDouble();
		
		cont1=(valor1*0.02) +valor1;
		cont2=(valor1*0.035) +valor2;
		saf=sa-(cont1+cont2);
		
		System.out.printf(" O salario final do João é: %5.2f\n", saf);

		

	}

}
