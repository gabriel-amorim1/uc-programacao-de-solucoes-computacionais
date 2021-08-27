import java.util.Scanner;

/*
 * Faça um programa que leia o sexo e a altura (H - em metros) de uma
 * pessoa, calcule e apresente seu peso ideal utilizando as seguintes
 * fórmulas:
 * Peso ideal (homens) = (72,7 * H) – 58
 * Peso ideal (mulheres) = (62,1 * H) – 44,7
 */

public class Questao5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char gender;
        double height, idealWeight;

        System.out.print("Digite seu gênero ('H' ou 'M'): ");
        gender = read.next().charAt(0);

        System.out.print("\nDigite sua altura: ");
        height = read.nextFloat();

        read.close();

        if (gender == 'H') {
            idealWeight = (72.7 * height) - 58;
            System.out.print("\nSeu peso ideal é: " + idealWeight);
        } else if (gender == 'M') {
            idealWeight = (62.1 * height) - 44.7;
            System.out.print("\nSeu peso ideal é: " + idealWeight);
        }
    }
}
