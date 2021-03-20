import java.util.Scanner;

/*
 * Faça um programa que receba um número inteiro e que imprima o antecessor,
 * o sucessor, o dobro e a metade do número informado.
 */

public class Questao11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um número inteiro: ");
		num = read.nextInt();
		
		read.close();
		
		System.out.printf("\nAntecessor: %d", num - 1);
		System.out.printf("\nSucessor: %d", num + 1);
		System.out.printf("\nDobro: %d", num * 2);
		System.out.printf("\nMetade: %f", (float)num / 2);
	}

}
