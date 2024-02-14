package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		int escolha;
		double A = 0, R = 0;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do item:");
		System.out.println("1_Cachorro Quente");
		System.out.println("2_X-Salada");
		System.out.println("3_X-Bacon");
		System.out.println("4_Torrada Simples");
		System.out.println("5_Refrigerante");
		System.out.println("0_Sair");

		escolha = sc.nextInt();
		
    while(escolha != 0) {
    	
		System.out.println("Digite a quantidade:");
		A = sc.nextDouble();
		
	

		
		if (escolha == 1) {
			R += A * 4.00;
			
		} else if (escolha == 2) {

			R += A * 4.50;
			
		} else if (escolha == 3) {

			R += A * 5.00;
			
		} else if (escolha == 4) {

			R += A * 2.00;
			
		} else if (escolha == 5) {

			R += A * 1.00;
			
		}
		System.out.println("Digite o código do item:");
		System.out.println("1_Cachorro Quente");
		System.out.println("2_X-Salada");
		System.out.println("3_X-Bacon");
		System.out.println("4_Torrada Simples");
		System.out.println("5_Refrigerante");
		System.out.println("0_Sair");

		escolha = sc.nextInt();
    }
		System.out.printf("O Total do pedido é: %.2f%n" , R);
		
		sc.close();

	}

}
