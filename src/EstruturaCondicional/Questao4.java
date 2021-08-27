import java.util.Scanner;

/*
 * Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos
 * dos lados de um triângulo. Se eles não formarem um triângulo escrever
 * uma mensagem. Considerar que o comprimento de cada lado de um
 * triângulo é menor que a soma dos outros dois lados.
 */

public class Questao4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float x, y, z;

        System.out.print("Digite o primeiro valor: ");
        x = read.nextFloat();

        System.out.print("\nDigite o segundo valor: ");
        y = read.nextFloat();

        System.out.print("\nDigite o terceiro valor: ");
        z = read.nextFloat();

        read.close();

        if (x > (y + z) || y > (x + z) || z > (x + y)) {
            System.out.println("\nOs valores não formam um triângulo.");
        } else {
            System.out.println("\nOs valores formam um triângulo");
        }
    }
}
