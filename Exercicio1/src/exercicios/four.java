package exercicios;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {

		int cod1, q1;
		double valor1, total;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite O código da peça:");
		cod1 = sc.nextInt();

		System.out.println("Digite o valor da peça:");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o valor da peça:");
		q1 = sc.nextInt();
		
		total = valor1*q1;
		
		System.out.println("Digite O código da peça:");
		cod1 = sc.nextInt();

		System.out.println("Digite o valor da peça:");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o valor da peça:");
		q1 = sc.nextInt();
		
		total = total + valor1*q1;
		
		
		System.out.printf("Total a ser pago: R$ %.2f%n", total);

		sc.close();
	}

}
