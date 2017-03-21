package pi1;

import java.util.Scanner;

public class autonomia_do_carro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double km, litros, km_litro;
        
        System.out.print("Informe o quilometro percorrido: ");
        km = leitor.nextDouble();
        
        System.out.print("Informe a quantia de litro gasta: ");
        litros = leitor.nextDouble();
        
        km_litro = km/litros;
        
        System.out.println("km/l = " + km_litro);
        
        
    }
    
}
