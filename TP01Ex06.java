import java.util.Scanner;
import java.lang.Math;
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
		int val1 = leitor.nextInt();
		System.out.println("Digite o segundo valor: ");
		int val2 = leitor.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int val3 = leitor.nextInt();
		System.out.println("Digite o quarto valor: ");
		int val4 = leitor.nextInt();
		System.out.println("A média aritmética dos valores é: " + (val1+val2+val3+val4)/4);
	}
}