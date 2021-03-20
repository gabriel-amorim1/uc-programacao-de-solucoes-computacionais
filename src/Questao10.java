import java.util.Scanner;

/*
 * Todo restaurante, embora por lei não possa obrigar o cliente
 * a pagar, cobra 10% para o garçom. Faça um programa que leia o
 * valor gasto pelo cliente e informe o valor a ser pago de gorjeta.
 */

public class Questao10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double amountSpent;
		
		System.out.printf("Digite o valor gasto: ");
		amountSpent = read.nextDouble();
		
		read.close();
		
		System.out.printf("\nO valor a ser pago de gorjeta é: %.2f", (amountSpent * 0.1));
	}

}
