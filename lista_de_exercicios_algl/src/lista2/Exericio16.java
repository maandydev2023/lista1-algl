package lista2;

import java.util.Scanner;

public class Exericio16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano, proximoBi;

		System.out.print("Digite um ano: ");
		ano = ler.nextInt();

		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			proximoBi = ano + (4 - (ano % 4));
			if (proximoBi % 100 == 0 && proximoBi % 400 != 0) {
				proximoBi += 4;
			}
			System.out.println(ano + " não é um ano bissexto. O próximo ano bissexto é " + proximoBi + ".");
		}
	}

}
