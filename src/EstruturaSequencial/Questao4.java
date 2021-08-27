import java.util.Scanner;

/*
 * Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2
 */

public class Questao4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float largerDiagonal, smallerDiagonal, area;
		
		System.out.printf("Informe a diagonal maior do losango: ");
		largerDiagonal = read.nextFloat();

		System.out.printf("Informe a diagonal menor do losango: ");
		smallerDiagonal = read.nextFloat();
		
		read.close();
		
		area = (largerDiagonal * smallerDiagonal) / 2;

		System.out.printf("\nA área do losango é: %f", area);
	}

}
