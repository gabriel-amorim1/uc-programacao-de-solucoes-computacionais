import java.util.Scanner;

/*
 * Faça um programa que receba a idade de um nadador e mostre a sua categoria
 * INFANTIL: idade <= 7
 * JUVENIL: idade >= 8 e idade <= 10
 * ADOLESCENTE: idade >= 11 e idade <= 15
 * ADULTO: idade >= 16 e idade <= 30
 * SENIOR: idade > 30
 */

public class Questao8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age;

        System.out.print("Digite a idade de um nadador: ");
        age = read.nextInt();

        read.close();

        if (age <= 7) {
            System.out.print("Categoria: INFANTIL");
        } else if (age >= 8 && age <= 10) {
            System.out.print("Categoria: JUVENIL");
        } else if (age >= 11 && age <= 15) {
            System.out.print("Categoria: ADOLESCENTE");
        } else if (age >= 16 && age <= 30) {
            System.out.print("Categoria: ADULTO");
        } else {
            System.out.print("Categoria: SENIOR");
        }
    }
}
