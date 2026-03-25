import java.util.Scanner;

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

        double volume = (Math.PI * raio * raio * altura) / 3;

        System.out.println("O volume do cone é: " + volume);
    }
}