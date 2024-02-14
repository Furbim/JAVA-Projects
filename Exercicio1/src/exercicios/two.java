package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);		
		
		double raio,area,A,B,C,D,R = 0;

		System.out.println("Digite o Raio do círculo em centímetros:");
		raio = sc.nextDouble();
		
		area = 3.14159 * (Math.pow(raio,2));
		
		System.out.println("A área deste círculo é igual a " + area + "cm quadrados");
		
		System.out.println("Digite o primeiro número:");
		A = sc.nextInt();
		
		System.out.println("Digite o segundo número:");
		B = sc.nextInt();
		
		System.out.println("Digite o terceiro número:");
		C = sc.nextDouble();
		
		System.out.println("Digite o quarto número:");
		D = sc.nextInt();
		
		R = Math.abs(A*B - C*D);
		
		System.out.println("A diferença dos produtos de A B C e D é: " + R);
		
		sc.close();
	}

}
