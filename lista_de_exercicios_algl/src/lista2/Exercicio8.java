package lista2;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Criando um objeto Scanner para ler dados do teclado
		Scanner ler = new Scanner(System.in);
		
		// Lendo o salário base
		System.out.println("Informe o salário base:" );
		double sb=ler.nextDouble();
		// Lendo a gratificação
		System.out.println("Informe a gratificação:" );
		double gr=ler.nextDouble();
		
		// Calculando o salário bruto
		double somasb= sb+gr;
		
		  // Calculando o imposto de renda
		double imposto;
		if(sb<2500) {
			imposto= sb*0.10;
		}else {
		 imposto=sb*0.15;
		 
		}
		 // Calculando o salário líquido
		 double salarioLiq= sb - imposto;
		 
		// Exibindo os resultados
		 System.out.printf("Salário bruto: R$ %.2f%n", sb);
	        System.out.printf("Gratificação: R$ %.2f%n", gr);
	        System.out.printf("Imposto de renda: R$ %.2f%n", imposto);
	        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiq);
			}
				
		}

		



