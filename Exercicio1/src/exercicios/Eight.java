package exercicios;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		double hi;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		hi = sc.nextDouble();
		
	        if (hi > 0 && hi <= 25) {
			
	       System.out.println( hi + " está no intervalo de 0 a 25");
	       
			} else if (hi > 25 && hi <= 50) {
			
				System.out.println( hi + " está no intervalo de 25 a 50");
				
			}else if (hi > 50 && hi <= 75) {
				System.out.println( hi + " está no intervalo de 50 a 75");
				
			}else if (hi > 75 && hi <= 100) {
				System.out.println( hi + " está no intervalo de 75 a 100");
				
			}	
			else {
				System.out.println("Número inválido!");
				
			}	
			
		
		sc.close();

	}

}
