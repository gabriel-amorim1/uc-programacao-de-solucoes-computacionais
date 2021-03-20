import java.util.Scanner;

/*
 * Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
 * - A idade da pessoa no ano atual
 * - A idade que a pessoa terá em 2050
 */

public class Questao2 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int yearOfBirth, currentYear, currentAge, ageIn2050;
	  

		System.out.printf("Informe o seu ano de nascimento: ");
		yearOfBirth = read.nextInt();

		System.out.printf("Informe o ano atual: ");
		currentYear = read.nextInt();
		
		read.close();
		
		currentAge = currentYear - yearOfBirth;
		
		ageIn2050 = 2050 - yearOfBirth;
		
		System.out.printf("\nIdade no ano atual: %d\n", currentAge);
		System.out.printf("\nIdade em 2050: %d\n", ageIn2050);
	}
	
}
