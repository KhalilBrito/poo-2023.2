/*1) Escrever um algoritmo que leia dados de 20 pessoas contendo, cada uma delas, a altura
e o sexo de cada pessoa (código=1, masculino código=2, feminino), calcule e mostre o
seguinte:
a) a maior e a menor altura das pessoas
b) a média da altura das mulheres
c) a média da altura das pessoas */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sexo, cont = 0, qtdeMulheres = 0;
        double altura, maiorAltura = 0, menorAltura = 0, mediaAlturaMulheres = 0, mediaAlturaPessoas = 0, somaAlturaMulheres = 0, somaAlturaPessoas = 0;

        while (cont < 20) {
            System.out.println("Digite o sexo da pessoa: ");
            sexo = input.nextInt();
            System.out.println("Digite a altura da pessoa: ");
            altura = input.nextDouble();

            if (cont == 0) {
                maiorAltura = altura;
                menorAltura = altura;
            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                }
            }

            if (sexo == 2) {
                somaAlturaMulheres += altura;
                qtdeMulheres++;
            }
            somaAlturaPessoas += altura;
            cont++;
        }

        mediaAlturaMulheres = somaAlturaMulheres / qtdeMulheres;
        mediaAlturaPessoas = somaAlturaPessoas / 20;

        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A média da altura das mulheres é: " + mediaAlturaMulheres);
        System.out.println("A média da altura das pessoas é: " + mediaAlturaPessoas);

        input.close();
    }
}