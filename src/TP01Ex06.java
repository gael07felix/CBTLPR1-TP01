import java.util.Scanner;

/*
 * Exercício 06
 * Enunciado: Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double val1 = leitor.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double val2 = leitor.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double val3 = leitor.nextDouble();

        System.out.println("Digite o quarto valor: ");
        double val4 = leitor.nextDouble();

        double media = (val1 + val2 + val3 + val4) / 4;

        System.out.println("A média aritmética dos valores é: " + media);
    }
}