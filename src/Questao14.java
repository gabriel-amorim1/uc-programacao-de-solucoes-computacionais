import java.util.Scanner;

/*
 * Faça um programa que leia duas variáveis e troque o 
 * conteúdo dessas duas variáveis. Em seguida, imprima 
 * o valor dessas variáveis invertido. 
 */

public class Questao14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a, b, aux;
		
		System.out.printf("Digite o valor da primeira variável: ");
		a = read.nextInt();
		
		System.out.printf("Digite o valor da segunda variável: ");
		b = read.nextInt();
		
		read.close();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.printf("\nValor da primeira variável invertida com o valor da segunda: %d", a);
		System.out.printf("\nValor da segunda variável invertida com o valor da primeira: %d", b);
	}

}
