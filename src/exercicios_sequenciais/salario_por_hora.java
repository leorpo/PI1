package pi1;

import java.util.Scanner;

public class salario_por_hora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        String funcionario;
        float valor_hora, salario;
        int horas_trabalhadas;
        
        System.out.println("Nome do Funcionario: ");
        funcionario = leitor.nextLine();
        
        System.out.println("Informe o valor da hora trabalhada: ");
        valor_hora = leitor.nextFloat();
        
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horas_trabalhadas = leitor.nextInt();
        
        salario = valor_hora * horas_trabalhadas;
        
        System.out.println("O funcionário " + funcionario + " trabalhou " + horas_trabalhadas
                        + "\nhoras por R$" + valor_hora + " e deve receber R$" + salario);
        
        
    }
}
