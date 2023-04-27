package Exercicios1;
import java.util.Scanner;

public class Calculo_Diferenca_ABCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, Diferenca;
				
		System.out.println("Digite 4 valores seguidos para saber a diferença.");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = ( A * B - C * D);
		
		System.out.printf("A Diferença entre o produto do primeiro pelo segundo e entre o terceiro pelo quarto é: %d", Diferenca);
		
		
		
		sc.close();
	}

}
