package lista2;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = ler.nextInt();

        System.out.println("Digite o valor de Y: ");
        int y = ler.nextInt();

        System.out.println("Digite o valor de Z: ");
        int z = ler.nextInt();

        if (x < y + z && y < x + z && z < x + y) {
            System.out.printf("Os valores %d, %d e %d formam um triângulo ", x, y, z);

            if (x == y && y == z) {
                System.out.println("equilátero.");
            } else if (x == y || y == z || x == z) {
                System.out.println("isósceles.");
            } else {
                System.out.println("escaleno.");
            }

        } else {
            System.out.printf("Os valores %d, %d e %d não formam um triângulo.", x, y, z);
        }
    }
}
