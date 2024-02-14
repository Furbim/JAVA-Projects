package exercicios;

import java.util.Locale;

public class one {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Escrivaninha";
		
		int age = 30;
		int code = 5290;
		char genero = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double Medida = 53.234567;
		
		
		System.out.printf("%s, cuo o preço é: %.2f%n",produto1,price1 );
		System.out.printf("%s, cuo o preço é: %.2f%n",produto2,price2 );
		System.out.println("");
		System.out.printf("Recordar: %d anos de idade, codigo %d e gênero: %s%n",age,code,genero );
		System.out.println("");
		System.out.printf("Medida com oito casas decimais: %.8f%n" , Medida);
		System.out.printf("Medida arredondada: %.3f%n" , Medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos US: %.3f%n" , Medida);
	}

}
