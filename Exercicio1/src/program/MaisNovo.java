package program;

import java.util.Locale;
import java.util.Scanner;

public class MaisNovo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantidade de pessoas: ");
		String[] name = new String[sc.nextInt()];
		int[] age = new int[name.length];
				
		String nv = "";
		int iv = 0;
		
		for (int i = 0; i < name.length; i++) {
			sc.nextLine();
			System.out.print("Enter your name: ");
			name[i]= sc.nextLine();
			System.out.print("Enter your age: ");
			age[i]= sc.nextInt();
			
			if (age[i] > iv ) {
				
				iv = age[i];
				nv = name[i];
				
			}
			
		}
		
		System.out.println("Oldest person name: "+ nv);
		
		
	sc.close();
	}

}
