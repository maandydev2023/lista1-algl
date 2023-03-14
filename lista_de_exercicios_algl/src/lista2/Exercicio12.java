package lista2;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);
	        
		  int opcao;
	        
	        do {
	            System.out.println("**** Menu de Opções *****");
	            System.out.println("1. Somar dois números");
	            System.out.println("2. Raiz quadrada de um número");
	            System.out.println("3. Elevar um número a uma potência");
	            System.out.println("4. Sair");
	            System.out.println("*************************");
	            System.out.print("Digite a opção desejada: ");
	            opcao = ler.nextInt();
	            
	            if (opcao == 1) {
	                System.out.print("Digite o primeiro número: ");
	                double num1 = ler.nextDouble();
	                System.out.print("Digite o segundo número: ");
	                double num2 = ler.nextDouble();
	                double resultado = num1 + num2;
	                System.out.println("O resultado da soma é: " + resultado);
	            } else if (opcao == 2) {
	                System.out.print("Digite o número: ");
	                double num = ler.nextDouble();
	                double resultado = Math.sqrt(num);
	                System.out.println("A raiz quadrada de " + num + " é: " + resultado);
	            } else if (opcao == 3) {
	                System.out.print("Digite o número base: ");
	                double base = ler.nextDouble();
	                System.out.print("Digite o expoente: ");
	                double expoente = ler.nextDouble();
	                double resultado = Math.pow(base, expoente);
	                System.out.println(base + " elevado a " + expoente + " é: " + resultado);
	            } else if (opcao == 4) {
	                System.out.println("Saindo...");
	            } else {
	                System.out.println("Opção inválida! Tente novamente.");
	            }
	            
	            System.out.println();
	            
	        } while (opcao != 4);
	        
	    }
	

	}

