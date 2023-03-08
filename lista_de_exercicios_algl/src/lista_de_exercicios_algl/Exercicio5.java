package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);

	        // leitura dos dados de entrada
	        System.out.print("Digite o valor do depósito: ");
	        double valorDeposito = ler.nextDouble();
	        System.out.print("Digite o valor da taxa de juros (em %): ");
	        double taxaJuros = ler.nextDouble();

	        // cálculo do rendimento e do valor total após o rendimento
	        double rendimento = valorDeposito * (taxaJuros / 100);
	        double valorTotal = valorDeposito + rendimento;

	        // exibição dos resultados
	        System.out.printf("Valor do rendimento: R$ %.2f\n", rendimento);
	        System.out.printf("Valor total após o rendimento: R$ %.2f\n", valorTotal);
	    }
	
	}


