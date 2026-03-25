import java.util.Scanner;
/*
 * Exercício 15
 * Enunciado: Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
   dólares. Calcular e exibir o valor correspondente em Reais (R$).
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a cotação atual do dólar: ");
        double c = leitor.nextDouble();
        System.out.println("Digite a quantidade de dólares: ");
        double d = leitor.nextDouble();

        System.out.println("O valor é de R$" + (c*d));
    }
}