import java.util.Scanner;

/*
 * Exercício 02
 * Enunciado: Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */

public class TP01Ex02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a aresta do quadrado: ");
		int aresta = leitor.nextInt();
		System.out.println("A área do quadrado é: " + Math.pow(aresta, 2));
	}
}
