package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		  Scanner ler= new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int num = ler.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%d x %d = %d\n", num, i, num * i);
	            
	            /*
	             * Neste exemplo, o programa utiliza um objeto da classe Scanner para receber a entrada do usuário. 
	             * Em seguida, um laço for é utilizado para iterar de 1 a 10 e calcular a tabuada do número informado pelo usuário. 
	             * A função printf() é utilizada para exibir os resultados na tela. A string formatada "%d x %d = %d\n" é utilizada para exibir a
	             * operação de multiplicação e o resultado correspondente para cada valor de i. O caractere de nova linha (\n) é utilizado para separar as 
	             * linhas da tabuada.
*/
	        }
	}
}
 