package Exercicios1;
import java.util.Scanner;

public class Salario_Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Htrabalhadas;
		double Vhora, Salario;
		
		System.out.println("Digite o valor de horas trabalhadas do funcionário:");
		Htrabalhadas = sc.nextInt();
		System.out.println("Digite o valor da Hora do funcionário");
		Vhora = sc.nextDouble();
		
		Salario = Htrabalhadas * Vhora;
		
		System.out.printf("O salário do funcionario é: %.2f", Salario);		

		sc.close();
	}

}
