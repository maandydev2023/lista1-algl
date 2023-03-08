package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        
        // Recebe o nome e salário base do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = ler.nextLine();

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = ler.nextDouble();

        // Calcula o salário líquido do funcionário
        double gratificacao = salarioBase * 0.10;
        double salarioGratificado = salarioBase + gratificacao;
        double desconto = salarioGratificado * 0.15;
        double salarioLiquido = salarioGratificado - desconto;

        // Exibe o nome e salário líquido do funcionário
        System.out.printf("%nFuncionário: %s%n", nome);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
	}

}
