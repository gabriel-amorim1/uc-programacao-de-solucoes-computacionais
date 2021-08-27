import java.util.Scanner;

/*
 * Faça um programa que receba 3 notas de um aluno, calcule e mostre
 * uma mensagem de acordo com sua média:
 * >= 0 e < 3 -> Reprovado
 * >= 3 e < 7 -> Exame
 * >= 7 e <= 10 -> Aprovado
 */

public class Questao3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float grade1, grade2, grade3, average;

        System.out.print("Digite a primeira nota: ");
        grade1 = read.nextFloat();

        System.out.print("\nDigite a segunda nota: ");
        grade2 = read.nextFloat();

        System.out.print("\nDigite a terceira nota: ");
        grade3 = read.nextFloat();

        read.close();

        average = (grade1 + grade2 + grade3) / 3;

        if (average >= 0 && average < 3) {
            System.out.println("\nReprovado");
        } else if (average >= 3 && average < 7) {
            System.out.println("\nExame");
        } else if (average >= 7 && average <= 10){
            System.out.println("\nAprovado");
        }
    }
}
