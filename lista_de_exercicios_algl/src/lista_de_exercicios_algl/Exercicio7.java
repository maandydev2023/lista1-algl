package lista_de_exercicios_algl;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = ler.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área do círculo: %.2f\n", area);
        System.out.printf("Perímetro do círculo: %.2f", perimetro);

	}

}
