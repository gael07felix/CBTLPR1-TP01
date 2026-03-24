import java.util.Scanner;
import java.lang.Math;

/*
 * Exercício 03
 * Enunciado: Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
 *
 * Alunos:
 * Gael Felix
 * Nome do colega
 */

public class TP01Ex03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a diagonal do quadrado: ");
		int diagonal = leitor.nextInt();
		System.out.println("A área do quadrado é: " + (Math.pow(diagonal, 2))/2);
	}
}