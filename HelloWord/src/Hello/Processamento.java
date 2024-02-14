package Hello;

import java.util.Locale;
import java.util.Scanner;

public class Processamento {

	public static void main(String[] args) {

		int escolha;
		double A = 0, B = 0, R = 0;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o Calculo:");
		System.out.println("1_Soma");
		System.out.println("2_Subtração");
		System.out.println("3_Multiplicação");
		System.out.println("4_Divisão");
		System.out.println("5_Potencia");
		System.out.println("6_Raiz quadrada");

		escolha = sc.nextInt();

		System.out.println("Digite o primeiro número:");
		A = sc.nextDouble();

		if (escolha != 6) {
			System.out.println("Digite o segundo número:");
			B = sc.nextDouble();
		}
		if (escolha == 1) {
			R = A + B;
			
		} else if (escolha == 2) {

			R = A - B;
			
		} else if (escolha == 3) {

			R = A * B;
			
		} else if (escolha == 4) {

			R = A / B;
			
		} else if (escolha == 5) {

			R = Math.pow(A, B);
			
		} else if (escolha == 6) {

			R = Math.sqrt(A);
			
		}

		System.out.println("O resultado é: " + R);
		
		sc.close();

	}

}
