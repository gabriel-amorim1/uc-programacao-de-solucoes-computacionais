import java.util.Scanner;

/*
 * Faça um programa que receba o valor do salário mínimo e o valor do 
 * salário de um funcionário, calcule e mostre a quantidade de salários
 * mínimos que ganha esse funcionário.
 */

public class Questao7 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float minimumWage, employeeSalary, quantityOfMinimumWage;
		
		System.out.printf("Informe o valor do salário mínimo: ");
		minimumWage = read.nextFloat();

		System.out.printf("Informe o valor do salário: ");
		employeeSalary = read.nextFloat();
		
		read.close();
		
		quantityOfMinimumWage = employeeSalary / minimumWage;

		System.out.printf("\nA quantidade de salários mínimos que ganha esse funcionário é: %f", quantityOfMinimumWage);
	}
	
}
