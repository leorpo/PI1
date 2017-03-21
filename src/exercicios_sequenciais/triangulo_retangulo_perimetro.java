package exercicios_sequenciais;

import java.util.Scanner;

public class triangulo_retangulo_perimetro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double c1, c2, hipotenusa, perimetro;

        System.out.print("Informe o valor do cateto 1: ");
        c1 = leitor.nextDouble();

        System.out.print("Informe o valor do cateto 2: ");
        c2 = leitor.nextDouble();

        c1 = Math.pow(c1, 2);
        c2 = Math.pow(c2, 2);
        hipotenusa = Math.sqrt(c1+c2);

        perimetro = hipotenusa + c1 + c2;
        
        System.out.println("Perimetro: " + perimetro);
        
    }
}
