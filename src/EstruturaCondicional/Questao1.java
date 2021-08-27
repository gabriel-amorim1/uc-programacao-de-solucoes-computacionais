import java.util.Scanner;

/*
 * Faça um programa que receba dois números e mostre o maior e o menor.
 * Emita uma mensagem, caso os dois sejam iguais.
 */

public class Questao1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a, b;

        System.out.print("Digite o primeiro número: ");
        a = read.nextDouble();

        System.out.print("\nDigite o segundo número: ");
        b = read.nextDouble();

        read.close();

        if (a > b) {
            System.out.println("\nMaior número: " + a + "\nMenor número: " + b);
        } else if (b > a) {
            System.out.println("\nMaior número: " + b + "\nMenor número: " + a);
        } else {
            System.out.println("\nOs números são iguais!");
        }
    }
}
