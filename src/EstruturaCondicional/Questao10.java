import java.util.Scanner;

/*
 * Faça um programa que leia o um número inteiro entre 1 e 7
 * e escreva o dia da semana correspondente. Caso o usuário digite
 * um número fora desse intervalo, deverá aparecer uma mensagem
 * informando que não existe dia da semana com esse número.
 */

public class Questao10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro entre 1 e 7: ");
        num = read.nextInt();

        read.close();

        switch (num) {
            case 1:
                System.out.print("\nDomingo");
                break;
            case 2:
                System.out.print("\nSegunda-feira");
                break;
            case 3:
                System.out.print("\nTerça-feira");
                break;
            case 4:
                System.out.print("\nQuarta-feira");
                break;
            case 5:
                System.out.print("\nQuinta-feira");
                break;
            case 6:
                System.out.print("\nSexta-feira");
                break;
            case 7:
                System.out.print("\nSábado");
                break;
            default:
                System.out.print("\nNão existe dia da semana com esse número.");
        }
    }
}
