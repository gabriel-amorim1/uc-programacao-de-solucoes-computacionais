import java.util.Scanner;

/*
 * Faça um programa que, tendo como dados de entrada a 
 * altura (H - em metros) de um homem, calcule e apresente
 * seu peso ideal utilizando a seguinte fórmula:
 * Peso ideal (P) = (72,7 * H) – 58. 
 */

public class Questao12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double height, idealHeight;
		
		System.out.printf("Digite a altura de um homem: ");
		height = read.nextFloat();
		
		read.close();
		
		idealHeight = (72.7 * height) - 58;
		
		System.out.printf("\nO peso ideal é: %f", idealHeight);
	}

}
