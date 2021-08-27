import java.util.Scanner;

/*
 * Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)
 */

public class Questao5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double celciusTemperature, fahrenheitTemperature;
		
		System.out.printf("Informe a temperatura em Celsius: ");
		celciusTemperature = read.nextDouble();
		
		read.close();
		
		fahrenheitTemperature = (celciusTemperature * 1.8) + 32;

		System.out.printf("\nTemperatura em Fahrenheit: %f", fahrenheitTemperature);
	}

}
