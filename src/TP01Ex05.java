import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 05
 * Enunciado: Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o diâmetro da esfera: ");
		int diametro = leitor.nextInt();
		double volume = (Math.PI*Math.pow(diametro, 3))/6;
		System.out.println("O volume da esfera é: " + volume);
	}
}
