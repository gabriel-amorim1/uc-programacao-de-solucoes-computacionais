import java.util.Scanner;

/*
 * Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
 * Somar
 * Subtrair
 * Multiplicar
 * Dividir
 * Sair
 * Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
 */

public class Questao12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float num1, num2;
        int option;

        System.out.print("Digite o primeiro número: ");
        num1 = read.nextFloat();

        System.out.print("\nDigite o segundo número: ");
        num2 = read.nextFloat();

        System.out.println("Escolha uma opção: \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.print(num1 + num2);
                break;
            case 2:
                System.out.print(num1 - num2);
                break;
            case 3:
                System.out.print(num1 * num2);
                break;
            case 4:
                System.out.print(num1 / num2);
                break;
            case 5:
                break;
        }
    }
}
