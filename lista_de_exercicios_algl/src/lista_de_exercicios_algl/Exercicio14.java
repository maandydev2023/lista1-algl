package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Definir variáveis para o salário e os cheques
        double salario, cheque1, cheque2;
        
        // Ler valores do usuário
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do salário: ");
        salario = ler.nextDouble();
        System.out.print("Digite o valor do primeiro cheque: ");
        cheque1 = ler.nextDouble();
        System.out.print("Digite o valor do segundo cheque: ");
        cheque2 = ler.nextDouble();
        
        // Calcular o saldo após o depósito do salário
        double saldo = salario;
        
        // Deduzir o valor do primeiro cheque e a taxa CPMF
        saldo -= cheque1;
        saldo -= cheque1 * 0.0038;
        
        // Deduzir o valor do segundo cheque e a taxa CPMF
        saldo -= cheque2;
        saldo -= cheque2 * 0.0038;
        
        // Exibir o saldo atual na tela
        System.out.println("O saldo atual é: " + saldo);
    }

	}

