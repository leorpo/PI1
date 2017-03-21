package pi1;

import java.util.Scanner;

public class conta_telefonica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float assinatura = 23.32f, locais, interurbanas, internacionais, total;

        System.out.println("Minutos gastos em Ligações Locais: ");
        locais = leitor.nextInt() * 0.09f;

        System.out.println("Minutos gastos em Ligações Interurbanas: ");
        interurbanas = leitor.nextInt() * 0.26f;

        System.out.println("Minutos gastos em Ligações Internacionais:  ");
        internacionais = leitor.nextInt() * 0.86f;

        total = assinatura + locais + interurbanas + internacionais;

        System.out.println("** Serviços cobrados **"
                + "\nAssinatura: R$" + assinatura
                + "\nLigações Locais: R$" + locais
                + "\nLigações Interurbanas: R$" + interurbanas
                + "\nLigações Internacionais: R$" + internacionais
                + "\n\nTotal a pagar: R$" + total);
    }
}
