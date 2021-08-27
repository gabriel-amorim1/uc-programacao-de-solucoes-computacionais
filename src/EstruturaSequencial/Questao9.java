import java.util.Scanner;

/*
 * Receba um número positivo, calcule e mostre:
 * - O número digitado ao quadrado
 * - O número digitado ao cubo
 * - A raiz quadrada do número digitado
 * - A raiz cúbica do número digitado
 */

public class Questao9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num;
		
		System.out.printf("Informe um número positivo: ");
		num = read.nextDouble();
		
		read.close();
		
		System.out.printf("\nNúmero digitado ao quadrado: %f", Math.pow(num, 2));
		System.out.printf("\nNúmero digitado ao cubo: %f", Math.pow(num, 3));
		System.out.printf("\nRaiz quadrada do número digitado: %f", Math.sqrt(num));
		System.out.printf("\nRaiz cúbica do número digitado: %f", Math.cbrt(num));
	}

}
