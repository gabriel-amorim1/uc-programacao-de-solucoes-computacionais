import java.util.Scanner;

/*
 * Faça o mesmo programa do item anterior, utilizando
 * a fórmula para o cálculo do peso ideal para mulheres:
 * Peso ideal (P) = (62,1 * H) – 44,7 
 */

public class Questao13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double height, idealHeight;
		
		System.out.printf("Digite a altura de uma mulher: ");
		height = read.nextFloat();
		
		read.close();
		
		idealHeight = (62.1 * height) - 44.7;
		
		System.out.printf("\nO peso ideal é: %f", idealHeight);
	}

}
