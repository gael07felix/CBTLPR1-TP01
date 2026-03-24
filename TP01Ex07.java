import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 07
 * Enunciado: Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double val1 = leitor.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double val2 = leitor.nextDouble();
		System.out.println("A média geométrica dos valores é: " + Math.sqrt(val1+val2));
	}
}
