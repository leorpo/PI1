package pi1;

import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float C, F;

        System.out.print("Informe a temperatura em Fahrenheit: ");
        F = leitor.nextInt();

        C = (F - 32) / (1.8f); // Constante

        System.out.println("A temperatura em Graus Celsius é de: " + C + "º");
    }
}
