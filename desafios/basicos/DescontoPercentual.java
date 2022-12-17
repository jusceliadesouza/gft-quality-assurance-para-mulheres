/*
 * O gerente de uma loja resolveu aplicar descontos em
 * todos os seus produtos! A tarefa é calcular a
 * Porcentagem de Desconto aplicada a esses produtos.
 * 
 * Entrada: dois valores (M e D), sendo eles o 
 * marcado do produto e, o outro, o desconto do produto já 
 * aplicado.
 * 
 * Saída: o percentual de desconto aplicado no produto
 */

import java.util.Scanner;

public class DescontoPercentual {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double M = input.nextDouble();
    double D = input.nextDouble();

    double desconto = ((M - D) / M) * 100;

    System.out.printf("O desconto foi de %.0f%%", desconto);
  }
}
