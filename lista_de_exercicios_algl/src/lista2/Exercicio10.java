package lista2;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

	
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o peso em kg: " );
    double peso=ler.nextDouble();
    
    System.out.println("Digite sua altura em metros:" );
    double altura = ler.nextDouble();
    
    double imc = peso/(altura*altura);
    
        if(imc<=16) {
        	System.out.println("Magreza Severa");
    }else if(imc<=17) {
    	System.out.println("Magreza Moderada");
    }else if(imc<=17&& imc<=18.5) {
    	System.out.println("Magreza Leve");
    } else if (imc > 18.5 && imc <= 25) {
        System.out.println("Classificação: Normal");
    } else if (imc > 25 && imc <= 30) {
        System.out.println("Classificação: Obesidade Leve");
    } else if (imc > 30 && imc <= 40) {
        System.out.println("Classificação: Obesidade Severa");
    } else {
        System.out.println("Classificação: Obesidade Mórbida");
    }
        
	}  
}
    
        
        
        
        
        
        
        
        