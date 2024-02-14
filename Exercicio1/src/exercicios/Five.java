package exercicios;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		double A , B , C , t , c , tra , q , r ;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Digite o primeiro número:");
		A = sc.nextDouble();
		
		System.out.println("Digite o segundo número:");
		B = sc.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		C = sc.nextDouble();
		
		t = (A*C)/2;
		c = 3.14159 * C;
		tra = ((A+B)*C)/2;
		q = Math.pow(B, 2);
		r = A*B;
		
		System.out.printf("A area do Triângulo é: %.3f%n",t);
		System.out.printf("A area do Círculo é: %.3f%n",c);
		System.out.printf("A area do Trapézio é: %.3f%n",tra);
		System.out.printf("A area do Quadrado é: %.3f%n",q);
		System.out.printf("A area do Retângulo é: %.3f%n",r);
		
		sc.close();
	}

}
