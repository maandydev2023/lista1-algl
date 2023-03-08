package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		   
		
		  Scanner ler = new Scanner(System.in);

	        System.out.print("Digite o salário bruto do funcionário: ");
	        double salarioBruto = ler.nextDouble();

	        double gratificacao = salarioBruto * 0.1;
	        double salarioBase = salarioBruto + gratificacao;
	        double desconto = salarioBase * 0.15;
	        double salarioLiquido = salarioBase - desconto;

	        System.out.println("Salário líquido do funcionário: " + salarioLiquido);


	}

}
