import java.util.Scanner;
import java.lang.Math;

/*
 * Exercício 16
 * Enunciado: Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
   seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
   Lembre-se que uma função trigonométrica trabalha em radianos.
 *
 * Alunos:
 * Gael Felix
 * João Gabriel
  Testando 
 */
public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();

        double radianos = Math.toRadians(graus);
        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante;

        if (cosseno != 0) {
            secante = 1 / cosseno;
        } else {
            secante = Double.NaN;
        } 

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
    }
}