package Exercicios1;
import java.util.Scanner;

public class Valor_peca_und {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Cod1, Cod2, Num1, Num2;
		double VUnd1, VUnd2, ValorPagar;
		
		Cod1 = sc.nextInt(); 
		Num1 = sc.nextInt(); 
		VUnd1 = sc.nextDouble();
		
		System.out.println();
		
		Cod2 = sc.nextInt(); 
		Num2 = sc.nextInt(); 
		VUnd2 = sc.nextDouble();
		
		ValorPagar = (Num1 * VUnd1 + Num2 * VUnd2);
		
		System.out.printf("Valor a pagar: R$%.2f", ValorPagar);
		
		sc.close();
		
	}

}
