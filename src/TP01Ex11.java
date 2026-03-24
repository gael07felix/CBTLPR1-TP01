import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 11
 * Enunciado: A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex11 {
    	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor do diâmetro: ");
		double diametro = leitor.nextDouble();
		System.out.println("A área do círculo é de: " + (Math.pow((diametro/2), 2)*Math.PI));
	}
}

