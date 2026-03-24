import java.util.Scanner;


/*
 * Exercício 01
 * Enunciado: Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */

public class TP01Ex01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        boolean v = true;

        do {
            System.out.println("Digite a base do retângulo: ");
            int base = leitor.nextInt();

            System.out.println("Agora digite a altura do retângulo: ");
            int altura = leitor.nextInt();

            if (base == altura) {
                System.out.println("Isto é um quadrado. Por favor, digite novamente.");
            } else {
                System.out.println("A área do retângulo é: " + (base * altura));
                v = false;
            }

        } while (v);

        leitor.close();
    }
}

