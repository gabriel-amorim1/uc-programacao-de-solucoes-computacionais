import java.util.Scanner;

/*
 * Leia três números inteiros e imprima a média aritmética entre esses números.
 */

public class Questao1 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a, b, c, arithmeticAverage;
	  

		System.out.printf("Informe o primeiro número inteiro: ");
		a = read.nextInt();

		System.out.printf("Informe o segundo valor número inteiro: ");
		b = read.nextInt();
		
		System.out.printf("Informe o terceiro valor número inteiro: ");
		c = read.nextInt();
		
		read.close();
		
		arithmeticAverage = ((a + b + c) / 3);
		
		System.out.printf("\nMédia aritmética entre esses números: %d\n", arithmeticAverage);
		System.out.printf("(%d + %d + %d) / 3 = %d\n", a, b, c, arithmeticAverage);
	}
	
}
