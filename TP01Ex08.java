import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 08
 * Enunciado: Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
   dois metros e que um quilômetro possui mil metros, fazer um programa para 
   converter milhas marítimas em quilômetros.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex08 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a  distância em milha marítima: ");
		double mm = leitor.nextDouble();
		System.out.println("A distância em KM é: " + mm*1.852);
	}
}
