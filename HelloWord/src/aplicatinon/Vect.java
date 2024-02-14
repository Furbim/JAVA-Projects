package aplicatinon;

import java.util.Locale;
import java.util.Scanner;

import entities.VectProduct;

public class Vect {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos produtos serão adicionados: ");

		VectProduct[] vect = new VectProduct[sc.nextInt()];

		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Digite o preço do produto: ");
		    double price = sc.nextDouble();
		    
		    vect[i] = new VectProduct(name, price);

		}
		
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {

		sum	+= vect[i].getPrice();
			
			
		}
		
		double avg = sum /vect.length;
		
		System.out.printf("Average height: %.2f%n", avg);
		
		
		sc.close();
	}

}
