import java.util.Scanner;

/*
 * Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais.
 */

public class Questao3 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float dollarQuotation, userDollars, userReais;
		
		System.out.printf("Informe a cotação do dólar em reais: ");
		dollarQuotation = read.nextFloat();

		System.out.printf("Informe o valor possuído em dólares: ");
		userDollars = read.nextFloat();
		
		read.close();
		
		userReais = userDollars * dollarQuotation;

		System.out.printf("\nValor possuído em reais: %.2f", userReais);
	}
	
}
