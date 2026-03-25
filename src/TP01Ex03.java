import java.util.Scanner;

/*
 * Exercício 03
 * Enunciado: Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */

public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a diagonal do quadrado: ");
        double diagonal = leitor.nextDouble();

        double area = (diagonal * diagonal) / 2;

        System.out.println("A área do quadrado é: " + area);
    }
}