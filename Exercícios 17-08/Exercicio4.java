/*4) Faça um algoritmo que permita ao usuário informar a idade de quantas pessoas ele
desejar. Após isso o algoritmo deve informar a soma das pessoas maiores de idade e a
média de idade das pessoas maiores de idade informadas. */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, somaIdade = 0, qtdPessoas = 0;

        System.out.print("Digite a idade: ");
        idade = input.nextInt();

        while (idade >= 0) {
            if (idade >= 18) {
                somaIdade += idade;
                qtdPessoas++;
            }

            System.out.print("Digite a idade: ");
            idade = input.nextInt();
        }

        System.out.println("Soma das idades: " + somaIdade);
        System.out.println("Média das idades: " + (somaIdade / qtdPessoas));
    }
}