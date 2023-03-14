package lista2;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe suas 3 notas de 0 a 100: ");
	   double n1=ler.nextDouble();
	   double n2=ler.nextDouble();
	   double n3=ler.nextDouble();
		
	   double peso1= 2;
	   double peso2=2;
	   double peso3= 4;
		
	   double mp=(n1*peso1 + n2*peso2 +n3* peso3)/(peso1+peso2+peso3);
		
	   System.out.printf("Notas: %.1f, %.1f, %.1f%n", n1, n2, n3);
       System.out.printf("Média: %.1f%n", mp);
		
       
       if(mp>=50) {
    	   System.out.println("APROVADO");
              }else if (mp>=45 && mp<50){
            	  System.out.println("RECUPERAÇÃO");
              }else
            	  System.out.println("REPROVADO");
              }
              
    	   
       }
	


