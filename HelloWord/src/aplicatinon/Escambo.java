package aplicatinon;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Escambo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dollar price: ");
		Calculadora.p =sc.nextDouble();
		
		System.out.print("How many dollars will be bought: ");
		Calculadora.q =sc.nextDouble();
		
		
		System.out.printf("Amout to be paid in reais: %.2f%n" ,  Calculadora.fullprice());
		
		sc.close();
	}

}
