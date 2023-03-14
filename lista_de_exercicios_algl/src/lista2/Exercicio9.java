package lista2;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		double salario, novoSalario,bonificacao,auxilioEscola;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o  salário do funcionário R$:" );
	    salario=ler.nextDouble();
		
	    if(salario<2000) {
	    	bonificacao = salario*0.10;
	    	}else if(salario<=3000) {
	    bonificacao = salario* 0.08;
	    }else {
	    	bonificacao = salario*0.05;
	    }
		
		if(salario<2500) {
			auxilioEscola=350.00;
		}else {
			auxilioEscola= 300.00;
		}
		
		novoSalario=salario+bonificacao+auxilioEscola;
		
		System.out.printf("Novo salário R$%.2f\n",novoSalario);
		
	}

}
	
	
	
	
	
	

		
		
		
		
		
		
		
	 
		
	
		
		


