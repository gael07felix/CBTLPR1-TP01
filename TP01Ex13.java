import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 13
 * Enunciado: Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
   valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
   (em s) que serão digitados.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex13 {	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da velocidade inicial do automóvel em metros por segundo: ");
		double vi = leitor.nextDouble();
                System.out.println("Digite o valor da aceleração em metros por segundo: ");
		double a = leitor.nextDouble();
                System.out.println("Digite o tempo em segundos: ");
		double t = leitor.nextDouble();
		System.out.println("A velocidade final do automóvel é de: " + (3.6*((vi+(a*t)))) + "km/h.");
	}
}
