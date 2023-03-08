package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = ler.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = ler.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f", area);
	}

}
