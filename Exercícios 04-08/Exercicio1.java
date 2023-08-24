//1) Leia o salário de um funcionário. Calcule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, novoSalario;

        System.out.println("Digite o salário do funcionário: ");
        salario = input.nextDouble();
        novoSalario = salario + (salario * 0.25);
        
        System.out.println("O novo salário do funcionário é: " + novoSalario);
    }
}