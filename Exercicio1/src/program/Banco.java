package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Cofre;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your account number: ");
		int code = sc.nextInt();

		System.out.print("Enter your Name: ");
		String name = sc.next();

		Cofre x = new Cofre(code, name);

		System.out.println("Do you want to do the firt deposit:  (1/yes)(2/no)");
		int c = sc.nextInt();

		if (c == 1) {

			System.out.print("Enter your first deposit: ");

			x.deposit(sc.nextDouble());
		}

		System.out.println(x.toString());

		System.out.print("Enter deposit value: ");
		x.deposit(sc.nextDouble());

		System.out.println(x.toString());

		System.out.print("Enter Withdraw value: ");
		x.withdraw(sc.nextDouble());

		System.out.println(x.toString());

		sc.close();
	}

}
