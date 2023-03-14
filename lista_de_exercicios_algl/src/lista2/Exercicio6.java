package lista2;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
       Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o seu sexo:(M para Masculino e F para Feminino) " );
        String sexo=ler.nextLine();
        
        System.out.println("Digite sua altura em centímetros:" );
        double altura = ler.nextDouble();
        
        double calcularPeso;
        
        if(sexo.equals("M")) {
        	calcularPeso = 52 + ( 0.75*(altura-152.4));
        
        }else if(sexo.equals("F")) {
              	calcularPeso = 52 + ( 0.67*(altura-152.4));
              	
        }else {
        	System.out.println("Sexo inválido");
            return;
        }
        System.out.printf("Seu peso ideal é %.2f kg.%n",calcularPeso );
	
	}
}
