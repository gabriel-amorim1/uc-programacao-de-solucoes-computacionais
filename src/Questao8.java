import java.util.Scanner;

/*
 * Leia um número e imprima a tabuada de multiplicar deste número.
 */

public class Questao8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		
		System.out.printf("Informe um número: ");
		num = read.nextInt();
		
		read.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n%d X %d = %d", num, i, (num*i));
		}
	}

}
