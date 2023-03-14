package lista2;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = ler.nextDouble();

        media = (nota1 + nota2 + nota3) / 3.0;

        if (media >= 6.0) {
            System.out.println("Aluno aprovado com média " + media);
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado com média " + media);
        } else {
            System.out.println("Aluno em recuperação com média " + media);
            System.out.print("Digite a nota da atividade de recuperação: ");
            double notaRecuperacao = ler.nextDouble();
            media = (media + notaRecuperacao) / 2.0;

            if (media >= 6.0) {
                System.out.println("Aluno aprovado por recuperação com média " + media);
            } else {
                System.out.println("Aluno reprovado com média " + media);
            }
        }
    

	}

}
