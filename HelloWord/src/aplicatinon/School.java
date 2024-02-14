package aplicatinon;

import java.util.Locale;

import java.util.Scanner;

import entities.ReportCard;

public class School {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		ReportCard x =new ReportCard();
		
		System.out.println("Type your first trimester's grade: ");
		x.ft = sc.nextDouble();
		
		System.out.println("Type your Second trimester's grade: ");
		x.st = sc.nextDouble();
		
		System.out.println("Type your third trimester's grade: ");
		x.tt = sc.nextDouble();
		
	    System.out.println("Final Grade: " + x.finalgrade());
	    System.out.println(x.result());
		
	sc.close();	
	}

}
