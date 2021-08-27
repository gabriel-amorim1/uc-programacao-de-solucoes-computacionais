import java.util.Scanner;

/*
 * Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação:
 * >= 7 -> Aprovado
 * < 7 -> Reprovado
 */

public class Questao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float grade1, grade2, average;

        System.out.print("Digite a primeira nota: ");
        grade1 = read.nextFloat();

        System.out.print("\nDigite a segunda nota: ");
        grade2 = read.nextFloat();

        read.close();

        average = (grade1 + grade2) / 2;

        if (average >= 7) {
            System.out.println("\nAprovado");
        } else {
            System.out.println("\nReprovado");
        }
    }
}
