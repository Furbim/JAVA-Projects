package aplicatinon;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class FormString {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
       double ax, ay;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 medidas do primeiro triângulo: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		

		System.out.println("Digite 3 medidas do segundo triângulo: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		ax = x.area();
		ay = y.area();

		System.out.printf("Triângulo X: %.4f%n" , ax);
		System.out.printf("Triângulo Y: %.4f%n" , ay);

		if (ax > ay) {

			System.out.printf("Maior área: X: %.4f%n" , ax);

		} else {

			System.out.printf("Maior área: Y: %.4f%n" , ay);

		}

		sc.close();
	}

}
