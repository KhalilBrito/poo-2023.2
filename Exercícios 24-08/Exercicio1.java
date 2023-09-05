/*Crie um programa que leia 8 números inteiros, armazene-os em um vetor, em seguida
solicite que ao usuário um valor de referência inteiro e
a) imprima os números do vetor que são maiores que o valor referência
b) retorne quantos números armazenados no vetor são menores que o valor de referência
c) retorne quantas vezes o valor de referência aparece no vetor*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[8];
        int numeroReferencia, numerosMenores = 0, numeroIgual = 0;

        for (int i = 0; i <  8; i++) {
            System.out.printf("Informe o número %d: \n", i+1);
            vetor[i] = input.nextInt();
        }

        System.out.printf("Informe o número de referência: \n");
        numeroReferencia = input.nextInt();

        for (int i = 0; i <  8; i++) {
            if (vetor[i] > numeroReferencia) {
                //a)
                System.out.printf("O número %d é maior que o número de referência %d \n", vetor[i], numeroReferencia); 
            } else if (vetor[i] < numeroReferencia) {
                numerosMenores++;
            } else {
                numeroIgual++;
            }
        }

        //b)    
        System.out.printf("\nNúmeros menores que o número de referência: %d\n", numerosMenores);

        //c)
        System.out.printf("Quantas vezes o número de referência aparece no vetor: %d", numeroIgual);

        input.close();
    }
}