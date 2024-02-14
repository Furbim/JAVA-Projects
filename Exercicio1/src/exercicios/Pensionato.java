package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] quarto = new String[9];

		System.out.print("Quantas pessoas irão se hospedar?");
		int n = sc.nextInt();
		int q = 0;

		for (int i = 0; i < n; i++) {

			do {
				System.out.print("Em qual quarto deseja se hospedar?");
				q = sc.nextInt();

			} while (quarto[q] != null);

			System.out.print("Qual o seu nome?");
			String nm = sc.next();

			System.out.print("Qual o seu email?");
			String e = sc.next();

			quarto[q] = (q + "_ Nome: " + nm + ". Email: " + e + ";");

		}
		for (int i = 0; i < 10; i++) {

			if (quarto[i] == null) {

				System.out.println(i + "_ Vazio;");

			} else {

				System.out.println(quarto[i]);

			}

		}

		sc.close();
	}

}
