import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 12
 * Enunciado: Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
   base que serão digitados.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da altura do cone: ");
		double altura = leitor.nextDouble();
                System.out.println("Digite o valor do raio do cone: ");
		double raio = leitor.nextDouble();
		System.out.println("O volume do cone é de: " + ((Math.PI*Math.pow(raio, 2))*altura));
	}
}
