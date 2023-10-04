/*2) Faça um programa leia um vetor V de inteiros com 15 elementos e em seguida retorne a
soma dos elementos deste vetor. */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[15];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);

        input.close();
    }
}