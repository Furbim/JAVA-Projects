package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Trabalhador;
import entities.enu.Level;

public class Worker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Department: ");
		String dn = sc.next();

		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Level: ");
		Level lv = Level.valueOf(sc.next());

		System.out.print("Base Salary: ");
		double bs = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(name, lv, bs, new Department(dn));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Enter contract #" + (i + 1) + " data:");

			System.out.println();
			System.out.print("Date (dd/MM/yyyy): ");
			String date = sc.next();
			LocalDate mes = LocalDate.parse(date, fmt);

			
			System.out.print("Value per hour: ");
			Double hourvalue = sc.nextDouble();

			
			System.out.println("Duration Hours");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(mes, hourvalue, hours);

			trabalhador.addcontract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		
		System.out.println("Name: " + trabalhador.getName());
		
		System.out.println("Department: " + trabalhador.getDepartment().getName());
		
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", trabalhador.income(year, month)));

		sc.close();
	}

}
