import java.util.Scanner;

/*
 * Construa um programa para determinar se o indivíduo está com um peso favorável.
 * Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida
 * como sendo a relação entre o peso (em kg) e o quadrado da Altura (em metros) do indivíduo.
 * IMC= PESO/ALTURA2
 * IMC < 20 -> Abaixo do peso
 * IMC >= 20 e IMC < 25 -> Peso normal
 * IMC >= 25 e IMC < 30 -> Sobre peso
 * IMC >= 30 e IMC < 40 -> Obeso
 * IMC >= 40 -> Obeso Mórbido
 */

public class Questao6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float weight, height;
        double imc;

        System.out.print("Digite seu peso em quilogramas: ");
        weight = read.nextFloat();

        System.out.print("\nDigite sua altura em metros: ");
        height = read.nextFloat();

        read.close();

        imc = weight / Math.pow(height, 2);

        if (imc < 20) {
            System.out.print("\nAbaixo do peso.");
        } else if (imc >= 20 && imc < 25) {
            System.out.print("\nPeso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.print("\nSobre peso.");
        } else if (imc >= 30 && imc < 40) {
            System.out.print("\nObeso.");
        } else {
            System.out.print("\nObeso Mórbido.");
        }
    }
}
