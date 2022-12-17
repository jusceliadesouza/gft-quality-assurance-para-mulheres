/*
 * Elabore um programa que simule uma fila de atendimento 
 * bancário. O programa deve ler o nome de 3 pessoas 
 * (clientes do banco), armazenando-os em uma fila.
 * 
 * Entrada: nomes de três pessoas
 * 
 * Saída: imprimir na tela o nome da pessoa e sua posição 
 * na fila.  
 */

import java.util.Scanner;

public class FilaBanco {
  public static void main(String[] args) {
    String[] nomesFila = new String[3];
    Scanner nome = new Scanner(System.in);

    System.out.println("Digite os nomes dos clientes: ");

    for (int i = 0; i < nomesFila.length; i++) {
      nomesFila[i] = nome.next();
    }

    for (int i = 0; i < nomesFila.length; i++) {
      System.out.printf("%s - esta na posicao: %d\n", nomesFila[i], (i + 1));
    }

    nome.close();
  }
}
