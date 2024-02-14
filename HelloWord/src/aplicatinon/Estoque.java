package aplicatinon;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product x = new Product();

		System.out.println("Digite os dados do produto: ");
		
		System.out.print("Nome: ");
		x.setName( sc.nextLine());
		
		System.out.print("Preço: ");
		x.setPrice( sc.nextDouble());
		
		System.out.print("Quantidade: ");
		x.setQuantity( sc.nextInt());
		
		System.out.println(x.tostring());

		System.out.println("Digite a quantidade a adicionar: ");
		x.add(sc.nextInt());
		System.out.println(x.tostring());

		System.out.println("Digite a quantidade a remover: ");
		x.remove(sc.nextInt());
		System.out.println(x.tostring());

		sc.close();
	}

}
