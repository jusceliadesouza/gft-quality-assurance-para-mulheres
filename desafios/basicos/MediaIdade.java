/*
 * Faça um programa que peça para 3 pessoas a sua idade,
 * ao final o programa deverá verificar se a média de
 * idade da turma varia entre 0 e 25, 26 e 60 e maior que
 * 60; e então, dizer se a turma é jovem, adulta ou idosa,
 * conforme a média calculada.
 * 
 * Entrada: três npumeros inteiros que representam a idade
 * de cada pessoa
 * 
 * Saída: média de idade da turma
 */

/**
 * mediaIdade
 */

import java.util.Scanner;

public class MediaIdade {
  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
      int idade1 = leitor.nextInt();
      int idade2 = leitor.nextInt();
      int idade3 = leitor.nextInt();

      double media = (idade1 + idade2 + idade3) / 3;

      System.out.print(Calcular(media));
    }
  }

  public static String Calcular(double media) {
    if (media < 26)
      return "Jovem!";
    if (media >= 26 && media <= 60)
      return "Adulta!";
    else
      return "Idosa!";
  }
}