package Exercicios1;
import java.util.Scanner;

public class Raio_Circulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double Raio, pi, Area;
		
		pi = 3.14159;
		
		/* Importante salientar para lembrete posterior que o JAVA interpreta
		 * de forma americana, logo o ponto flutuante é uma virgura e nao um ponto
		 * podendo geral confusão para a apresentação do projeto.*/
		
		System.out.println("Digite o valor do raio do Círculo");
		Raio = sc.nextDouble();
		
		Area = pi * (Raio * Raio);
		
		System.out.printf("A área do circulo de raio %.3f é: %.4f", Raio, Area);		
		
		sc.close();
	}

}
