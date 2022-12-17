/*
 * Dado um inteiro positivo n , retorne o menor inteiro
 * positivo que é um múltiplo 2 de e n .
 * 
 * Entrada: um inteiro, do qual podemos calcular seu menor
 * múltiplo
 * 
 * Saída: o menor múltiplo
 */

import java.util.Scanner;

public class MenorMultiplo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int menorMultiplo = 0;

    if (n % 2 == 0) {
      menorMultiplo = n;
    } else {
      menorMultiplo = n * 2;
    }

    System.out.printf("O resultado é: %d", menorMultiplo);
  }

}
