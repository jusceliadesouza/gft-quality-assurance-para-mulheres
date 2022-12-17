package desafios.intermediarios;

import java.util.Scanner;

public class FlechaEscudoEspada {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int jogadaJogador = leitor.nextInt();
    int jogadaInimigo = leitor.nextInt();

    // flecha ganha de espada
    // espada ganha de escudo
    // escudo ganha de flecha

    if (jogadaJogador == jogadaInimigo) {
      System.out.println("Empatou");
    } else {
      switch (jogadaJogador) {
        case 1:
          if (jogadaInimigo == 2) { // flecha x escudo
            System.out.println("Perdeu");
            break;
          }
          if (jogadaInimigo == 3) { // flecha x espada
            System.out.println("Ganhou");
            break;
          }
        case 2:
          if (jogadaInimigo == 1) { // escudo x flecha
            System.out.println("Ganhou");
            break;
          }
          if (jogadaInimigo == 3) { // escudo x espada
            System.out.println("Perdeu");
            break;
          }
        case 3:
          if (jogadaInimigo == 1) { // espada x flecha
            System.out.println("Perdeu");
            break;
          }
          if (jogadaInimigo == 2) { // espada x escudo
            System.out.println("Ganhou");
            break;
          }
        default:
          System.out.print("Entrada inválida");
          break;
      }
    }

    leitor.close();
  }
}