package exercicios;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, s = 0;
		int soma = 0;

		x = sc.nextInt();

		for (int i = 0; i < x; i += 1) {

			s = sc.nextInt();

			soma += s;

		}
		
		System.out.println("O resultado da soma foi " + soma);
		
		soma = 0;
		
		x = sc.nextInt();

		for (int i = 0; i < x; i += 1) {

			soma += x - i;

		}

		System.out.println("O resultado da soma foi " + soma);

		soma = 0;

		x = sc.nextInt();

		while (x != 0) {

			soma += x;

			x = sc.nextInt();
		}

		System.out.println("O resultado da soma foi " + soma);

		sc.close();

	}

}
