package estruturas_de_decisao;

import java.util.Scanner;

public class saudacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;

        System.out.println("Informe seu nome: ");
        nome = leitor.nextLine();

        if (nome.length() == 0) {
            System.out.println("Olá, mundo!");
        } else {
            System.out.println("Olá, " + nome + "!");
        }

    }
}
