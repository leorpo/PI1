package pi1;

import java.util.Scanner;

public class triangulo_retangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double c1, c2, hipotenusa;
        
        System.out.print("Informe o valor do cateto 1: ");
        c1 = leitor.nextDouble();
        
        System.out.print("Informe o valor do cateto 2: ");
        c2 = leitor.nextDouble();
        
        hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
