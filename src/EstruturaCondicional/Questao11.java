import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro entre 1 e 12
 * e escrever o mês correspondente. Caso o usuário digite um
 * número fora desse intervalo, deverá aparecer uma mensagem
 * informando que não existe mês com este número.
 */

public class Questao11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro entre 1 e 12: ");
        num = read.nextInt();

        read.close();

        switch (num) {
            case 1:
                System.out.print("\nJaneiro");
                break;
            case 2:
                System.out.print("\nFevereiro");
                break;
            case 3:
                System.out.print("\nMarço");
                break;
            case 4:
                System.out.print("\nAbril");
                break;
            case 5:
                System.out.print("\nMaio");
                break;
            case 6:
                System.out.print("\nJunho");
                break;
            case 7:
                System.out.print("\nJulho");
                break;
            case 8:
                System.out.print("\nAgoso");
                break;
            case 9:
                System.out.print("\nSetembro");
                break;
            case 10:
                System.out.print("\nOutubro");
                break;
            case 11:
                System.out.print("\nNovembro");
                break;
            case 12:
                System.out.print("\nDezembro");
                break;
            default:
                System.out.print("\nNão existe mês com este número.");
        }
    }
}
