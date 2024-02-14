package Hello;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Digite a sua altura: ");
			vect[i] = sc.nextDouble();

		}
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {

			
			sum += vect[i];

		}
		double average = sum / n;
		
		System.out.printf("Média de altura: %.2f", average);

		sc.close();
	}

}
