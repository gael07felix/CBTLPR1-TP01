import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 17
 * Enunciado: Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
   cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex17 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        double x = leitor.nextDouble();
        System.out.println("Digite o valor de Y: ");
        double y = leitor.nextDouble();

        System.out.println("Resultado de X^Y: " + Math.pow(x, y));
    }
}