package exercicios;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		double n, r ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		n = sc.nextDouble();
		
		r = n % 2;
		
		if ( r == 0) {
			System.out.println( n + " é par!");
		}
		else {
			System.out.println( n + " é ímpar!");
		}
		sc.close();

	}

}
