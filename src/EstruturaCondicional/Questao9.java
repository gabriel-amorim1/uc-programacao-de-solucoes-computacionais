import java.util.Scanner;

/*
 * Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
 * não eleitor (abaixo de 16 anos)
 * eleitor obrigatório (entre a faixa de 18 e menor de 65 anos)
 * eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)
 */

public class Questao9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age;

        System.out.print("Digite sua idade: ");
        age = read.nextInt();

        read.close();

        if (age < 16) {
            System.out.print("\nNão eleitor.");
        } else if (age >= 18 && age <= 65) {
            System.out.print("\nEleitor obrigatório.");
        } else if ((age >= 16 && age < 18) || age > 65) {
            System.out.print("\nEleitor facultativo.");
        }
    }
}
