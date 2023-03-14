package lista2;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		    
		    System.out.println("Informe a hora de inicio do jogo: ");
		    double horaI= ler.nextDouble();
		    double minutoI=ler.nextDouble();
		    
		    System.out.println("Informe a hora de fim do jogo: ");
		    double horaT= ler.nextDouble();
		    double minutoT=ler.nextDouble();
			
			 double duracaoH,duracaoM;
			 
			 if(horaI<horaT) {
				 duracaoH=horaT-horaI;
				 if(minutoT>=minutoI) {
					 duracaoM = minutoT -minutoI;
				 }else {
					 duracaoM= 60 -(minutoI-minutoT);
					 duracaoH--;
				 }
			 } else if (horaI > horaT) {
		         duracaoH = (24 - horaI) + horaT;
		         if (minutoT >= minutoI) {
		             duracaoM = minutoT - minutoI;
		         } else {
		             duracaoM = 60 - (minutoI - minutoT);
		             duracaoH--;
		         }
		     } else {
		         duracaoH = 24;
		         if (minutoT >= minutoI){
		             duracaoM = minutoT - minutoI;
		         } else {
		             duracaoM = 60 - (minutoI - minutoT);
		             duracaoH--;
		         }
		     }

		     System.out.println("Duração do jogo: " + duracaoH+ " horas e " + duracaoM + " minutos");


			
			
			
			}
			
		}