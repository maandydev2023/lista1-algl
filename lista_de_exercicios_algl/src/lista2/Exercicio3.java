package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nome o aluno:");
		String aluno = ler.nextLine();

		System.out.println("Informe as 4 notas: ");
		double n1 = ler.nextDouble();
		double n2 = ler.nextDouble();
		double n3 = ler.nextDouble();
		double n4 = ler.nextDouble();

		double media = (n1 + n2 + n3 + n4) / 4.0;

		System.out.printf("Nome: %s\n", aluno);
		System.out.printf("Notas: %.2f, %.2f, %.2f, %.2f\n", n1, n2, n3, n4);
		System.out.printf("Média: %.2f\n", media);

		if (media <= 20.0) {
			System.out.println("Classificação: Péssimo");
		} else if (media < 40.0) {
			System.out.println("Classificação: Ruim");
		} else if (media < 60.0) {
			System.out.println("Classificação: Regular");
		}
		else if (media < 80.0) {
			System.out.println("Classificação: Bom");
		} else {
			System.out.println("Classificação: Òtimo");

		}

	}
}
