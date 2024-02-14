package aplicatinon;

import java.util.Locale;
import java.util.Scanner;

import entities.PaymentPaper;

public class Paper {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		PaymentPaper x = new PaymentPaper();

		System.out.println("Type your name:");
		x.name = sc.nextLine();
		System.out.println("Type your gross salary:");
		x.sb = sc.nextDouble();
		System.out.println("Type the rate:");
		x.rate = sc.nextDouble();
		
	
		System.out.println("Employee: " + x.tostring());
		
		System.out.println("Which percentage to increase salary? ");
		x.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + x.tostring());
		
		sc.close();
	}

}
