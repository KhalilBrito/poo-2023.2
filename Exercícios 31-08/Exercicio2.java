/*2) Ler um vetor de 10 elementos inteiros e positivos. Criar um segundo vetor da seguinte
forma: os elementos de índice par receberão os respectivos elementos divididos por 2; os
elementos de índice ímpar receberão os respectivos elementos multiplicados por 3. Imprima
os dois vetores. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um número inteiro e positivo: ");
            vetor1[i] = input.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (i % 2 == 0) {
                vetor2[i] = vetor1[i] / 2;
            } else {
                vetor2[i] = vetor1[i] * 3;
            }
        }

        System.out.println("Vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }

        input.close();
    }
}