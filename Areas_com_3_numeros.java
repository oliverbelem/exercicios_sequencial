package Exercicios1;
import java.util.Scanner;

public class Areas_com_3_numeros {

	public static void main(String[] args) {
		
		
		/* a) Area do Triangulo Retangulo (Base A e Altura C);
		 * b) Area do circulo de Raio C;
		 * c) Area do Trapézio com A e B como bases e C como Altura;
		 * d) Area do quadrado de Lado B;
		 * e) Area do retangulo de lados A e B
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		double La, Lb, Lc, pi;
		double Atri, Acirc, Atrap, Aquad, Aret;
		
		pi = 3.14159;
		
		La = sc.nextFloat();
		Lb = sc.nextFloat();
		Lc = sc.nextFloat();
		
		Atri = (La * Lc) / 2;
		Acirc = pi * (Lc * Lc);
		Atrap = ((La + Lb) * Lc) / 2;
		Aquad = Lb * Lb;
		Aret = La * Lb;
		
		System.out.printf("a) Area do Triangulo Retangulo: %.3f \n", Atri);
		System.out.printf("b) Area do Circulo: %.3f \n", Acirc);
		System.out.printf("c) Area do Trapézio: %.3f \n", Atrap);
		System.out.printf("d) Area do Quadrado: %.3f \n", Aquad);
		System.out.printf("e) Area do Retângulo: %.3f \n", Aret);
				
		sc.close();
	}

}
