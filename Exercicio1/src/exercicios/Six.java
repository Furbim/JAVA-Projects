package exercicios;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		double n ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		n = sc.nextDouble();
		
		if ( n < 0) {
			System.out.println( n + " é negativo!");
		}
		else {
			System.out.println( n + " é positivo!");
		}
		sc.close();
	}

}
