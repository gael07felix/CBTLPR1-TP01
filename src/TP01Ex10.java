import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 10
 * Enunciado: Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
   exibir sua temperatura equivalente em Fahrenheit.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex10 {
	public static void main(String[] args) { 	
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da temperatura em Celsius: ");
		double celsius = leitor.nextDouble();
		System.out.println("A temperatura em Fahreinheit é de: " + ((celsius*1.8)+32) + "°F");
	}
}
