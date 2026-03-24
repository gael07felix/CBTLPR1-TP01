import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 14
 * Enunciado: Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
   “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do raio da esfera: ");
        double r = leitor.nextDouble();
        System.out.println("Digite o valor da aresta do cubo: ");
        double a = leitor.nextDouble();
        double volumeCubo = Math.pow(a, 3);
        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume do ambiente livre é: " + volumeLivre);
    }
}
