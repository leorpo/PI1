package exercicios_sequenciais;

import java.util.Scanner;

public class bhaskara_as_avessas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double x1, x2, a, b, c;
        
        System.out.println("Informe o X1: ");
        x1 = leitor.nextDouble();
        
        System.out.println("Informe o X2: ");
        x2 = leitor.nextDouble();
        
        System.out.println("Informe o eixo Y: ");
        c = leitor.nextDouble();
        
        a = c / (x1*x2);
        b = ((x1+x2) / a) * -1;

        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c);
    }
}
