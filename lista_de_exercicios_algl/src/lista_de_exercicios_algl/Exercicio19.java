package lista_de_exercicios_algl;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        System.out.print("Digite a duração do evento em segundos: ");
        int duracaoSegundos = ler.nextInt();

        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;
        int milissegundos = duracaoSegundos * 1000;

        //System.out.println("Duração do evento: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos e " + milissegundos + " milissegundos.");
        System.out.printf("%d horas, %d minutos, %d segundos e %d milissegundos", horas, minutos, segundos, milissegundos);

        

	}

}
