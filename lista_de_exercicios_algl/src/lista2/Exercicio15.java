package lista2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Recebe dois valores literais e armazena-os em variáveis distintas
		System.out.print("Digite o primeiro valor: ");
		String valor1 = scanner.nextLine();

		System.out.print("Digite o segundo valor: ");
		String valor2 = scanner.nextLine();

		// Troca os conteúdos das variáveis
		String troca = valor1;
		valor1 = valor2;
		valor2 = troca;

		// Exibe o novo conteúdo de cada variável
		System.out.println("O novo conteúdo da variável 1 é: " + valor1);
		System.out.println("O novo conteúdo da variável 2 é: " + valor2);

		scanner.close();
	}

}
