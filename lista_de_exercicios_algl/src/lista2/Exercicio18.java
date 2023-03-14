package lista2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a primeira nota do aluno (entre 0 e 100): ");
		double nota1 = ler.nextDouble();

		System.out.print("Digite a segunda nota do aluno (entre 0 e 100): ");
		double nota2 = ler.nextDouble();

		System.out.print("Digite a terceira nota do aluno (entre 0 e 100): ");
		double nota3 = ler.nextDouble();

		System.out.print("Digite a quarta nota do aluno (entre 0 e 100): ");
		double nota4 = ler.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.print("Digite a quantidade total de aulas dadas: ");
		int totalAulas = ler.nextInt();

		System.out.print("Digite a quantidade de presenças do aluno: ");
		int presencas = ler.nextInt();

		if (media > 80 && presencas == totalAulas) {
			System.out.println("O aluno ganhou uma Excursão!");
		} else if (media > 80 || presencas == totalAulas) {
			System.out.println("O aluno ganhou uma Camiseta!");
		} else if (media >= 70 && presencas == totalAulas) {
			System.out.println("O aluno ganhou um Squeeze!");
		} else if (media >= 70 || presencas == totalAulas) {
			System.out.println("O aluno ganhou uma Caneta Personalizada!");
		} else {
			System.out.println("O aluno não atingiu as condições necessárias para ganhar um prêmio.");
		}
	}

}
