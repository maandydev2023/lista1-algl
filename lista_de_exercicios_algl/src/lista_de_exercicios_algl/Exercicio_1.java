package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// DECLARO AS VARIAVEIS
		int a, b, c, d, r1, r2, r3, r4, r5, r6;
		// CRIO O SCANNER PARA ENTRADA DOS DADOS
		Scanner result = new Scanner(System.in);
		// ATRIBUO VALOR AS VARIAVEIS
		a = 5;
		b = 1;
		c = 3;
		d = 8;
		// REALIZO A CONTA
		r1 = a * b - c + d;
		r2 = a * (b - c);
		r3 = a - c * c + a;
		r4 = d * (b / 2);
		r5 = b * d * a - c;
		r6 = (a + b + c) * d;
		// EXIBO O RESULTADO
		System.out.printf("Resultado 1 :%d\n", r1);
		System.out.printf("Resultado 2 : %d\n", r2);
		System.out.printf("Resultado 3 : %d\n", r3);
		System.out.printf("Resultado 4 : %d\n", r4);
		System.out.printf("Resultado 5 : %d\n", r5);
		System.out.printf("Resultado 6 : %d\n", r6);
	}

}
