import java.util.Scanner;

/*
 * Uma empresa decide dar aumento de 30% aos funcionários com
 * salários inferiores a R$1000,00. Faça um programa que receba
 * o salário do funcionário e mostre o valor do salário reajustado
 * ou uma mensagem, caso o funcionário não tenha direito ao aumento.
 */

public class Questao7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float salary;

        System.out.print("Digite o valor do salário: ");
        salary = read.nextFloat();

        read.close();

        if (salary < 1000) {
            System.out.printf("\nSalário reajustado: R$ %.2f", (salary * 1.3));
        } else {
            System.out.print("\nApenas os funcionários com salário abaixo de R$ 1000,00 tem direito ao aumento.");
        }
    }
}
