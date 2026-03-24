import java.util.Scanner;
import java.lang.Math;
/*
 * Exercício 18
 * Enunciado: Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
   valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
   que deverá ser devolvido. 
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
 */
public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor do produto " + i + ": ");
            double valor = leitor.nextDouble();
            soma += valor;
        }

        System.out.print("Digite o valor pago: ");
        double pagamento = leitor.nextDouble();
        double troco = pagamento - soma;
        System.out.println("Total da compra: " + soma);

        if (troco >= 0) {
            System.out.println("Troco: " + troco);
        } else {
            System.out.println("Valor insuficiente! Falta: " + (-troco));
        }
    }
}
