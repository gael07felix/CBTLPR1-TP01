import java.util.Scanner;
/*
 * Exercício 04
 * Enunciado: A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a base do triângulo: ");
		int base = leitor.nextInt();
		System.out.println("Agora digite a altura do triângulo: ");
		int altura = leitor.nextInt();
		System.out.println("A área do triângulo é: " + (base*altura)/2);
	}
}
