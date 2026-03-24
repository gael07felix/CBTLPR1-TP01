import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 09
 * Enunciado: Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
   valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da resistência em ohms: ");
		double res = leitor.nextDouble();
		System.out.println("Digite o valor da corrente em amperes: ");
		double corrente = leitor.nextDouble();
		System.out.println("A tensão é de: " + res*corrente + "volts.");
	}
}
