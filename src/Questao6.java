import java.util.Scanner;

/*
 * Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma 
 * equação de segundo grau, e que imprima as raízes desta equação (considere que os valores 
 * informados sempre retornarão raízes reais para a equação).
 */

public class Questao6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
	  

		System.out.printf("Informe o coeficiente a: ");
		a = read.nextFloat();

		System.out.printf("Informe o coeficiente b: ");
		b = read.nextFloat();
		
		System.out.printf("Informe o coeficiente c: ");
		c = read.nextFloat();
		
		read.close();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println(delta);
		r1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
		
		r2 = ((b * -1) - (Math.sqrt(delta))) / (2 * a);
		
		System.out.printf("Raízes da equação: %f e %f", r1, r2);
	}

}
