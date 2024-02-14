package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AumentoLista {

	public static void main(String[] args) {
	 
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List <Integer> id = new ArrayList<>();
		List <String> nm = new ArrayList<>();
		List <Double> s = new ArrayList<>();
	
	System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		
			System.out.print("Employee ID: ");
			id.add(sc.nextInt()); 
			
			System.out.print("Employee name: ");
			nm.add(sc.next());
			
			System.out.print("Employee salary: ");
			s.add(sc.nextDouble());
			
		}
		
		System.out.print("Enter the employee id that will have a salary increase: ");
		
		int pr = id.indexOf(sc.nextInt());
		
		
		double si = s.get(pr);
		
		System.out.print("Enter the percentage: ");
		double p = sc.nextDouble();
	
		s.remove(pr);
	    s.add(pr, si * (1 + p / 100));
	    
	    
	    
	    for(int i=0 ; i < n; i++ ) {
	    System.out.println(id.get(i)+", "+ nm.get(i)+", "+ s.get(i));
	    }
	    
		sc.close();
	}

}
