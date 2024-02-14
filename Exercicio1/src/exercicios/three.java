package exercicios;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		
		int horas, fun;
		double salario,totalhora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu número de funcionário:");
		fun = sc.nextInt();
		
		System.out.println("Digite seu número de horas trabalhadas:");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada:");
		totalhora = sc.nextDouble();
		
		salario = horas * totalhora;
		
		System.out.printf("O funcionário %d recebe %.2f de salário",fun,salario);
		
		sc.close();
	}

}
