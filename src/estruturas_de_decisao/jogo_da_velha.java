package estruturas_de_decisao;

import java.util.Scanner;

public class jogo_da_velha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char c1 = ' ', c2 = ' ', c3 = ' ', c4 = ' ', c5 = ' ', c6 = ' ', c7 = ' ', c8 = ' ', c9 = ' ';
        char jogador;
        int tentativa = 0;

        while (tentativa < 9) {
            tentativa++;

            System.out.println("\nVocê é X ou O? ");
            jogador = leitor.next().charAt(0);

            System.out.println("Informe a sua localização: ");
            int localizacao = leitor.nextInt();

            switch (localizacao) {
                case 1:
                    c1 = jogador;
                    break;
                case 2:
                    c2 = jogador;
                    break;
                case 3:
                    c3 = jogador;
                    break;
                case 4:
                    c4 = jogador;
                    break;
                case 5:
                    c5 = jogador;
                    break;
                case 6:
                    c6 = jogador;
                    break;
                case 7:
                    c7 = jogador;
                    break;
                case 8:
                    c8 = jogador;
                    break;
                case 9:
                    c9 = jogador;
                    break;

            }

            System.out.println("  " + c7 + "  |  " + c8 + "  |  " + c9 + "  ");
            System.out.println("-----+-----+-----");
            System.out.println("  " + c4 + "  |  " + c5 + "  |  " + c6 + " ");
            System.out.println("-----+-----+-----");
            System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3 + "  ");
        }

        System.out.println("FIM DE JOGO!");
    }
}
