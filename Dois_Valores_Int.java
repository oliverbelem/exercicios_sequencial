package Exercicios1;
import java.util.Scanner;

public class Dois_Valores_Int {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num1, Num2, Soma;
		
		Num1 = sc.nextInt();
		Num2 = sc.nextInt();
		
		Soma = Num1 + Num2;
		
		System.out.printf("A soma dos numeros %d e %d gera o resultado: %d", Num1, Num2, Soma);
		
		sc.close();
	}

}
