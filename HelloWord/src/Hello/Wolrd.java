package Hello;

import java.util.Locale;

public class Wolrd {

	public static void main(String[] args) {
		String nome = "Vanessa";
		int Vagabundos = 23 + 12;
		double media = 78.99;
		char sexo = 'M';
		Locale.setDefault(Locale.US);
		System.out.println("Nome: " + nome);
		System.out.println("Vagabundos:" + Vagabundos);
		System.out.println("Média" + media);
		System.out.println("Sexo" + sexo);
		System.out.printf("%.4f%n", media);
		System.out.printf("%s deu para um total de %d vagabundos do sexo %s com uma média de idade de %.4f%n", nome,Vagabundos,sexo,media);
		
	}

}
