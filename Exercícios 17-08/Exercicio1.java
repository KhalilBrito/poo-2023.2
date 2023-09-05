/*1) Escreva o menu de opções abaixo. Leia a opção do usuário e execute a operação
escolhida. Escreva uma mensagem de erro se a opção for inválida.
Escolha a opção:
1- Soma de 2 números.
2- Diferença entre 2 números (maior pelo menor).
3- Produto entre 2 números.
4- Divisão entre 2 números (o denominador não pode ser zero). */

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        double num1, num2, resultado;

        System.out.println("Escolha a opção:");
        System.out.println("1- Soma de 2 números.");
        System.out.println("2- Diferença entre 2 números (maior pelo menor).");
        System.out.println("3- Produto entre 2 números.");
        System.out.println("4- Divisão entre 2 números (o denominador não pode ser zero).");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();
                resultado = num1 + num2;
                System.out.println("A soma dos números é: " + resultado);
                break;
            case 2:
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();
                if (num1 > num2) {
                    resultado = num1 - num2;
                    System.out.println("A diferença entre os números é: " + resultado);
                } else {
                    resultado = num2 - num1;
                    System.out.println("A diferença entre os números é: " + resultado);
                }
                break;
            case 3:
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();
                resultado = num1 * num2;
                System.out.println("O produto dos números é: " + resultado);
                break;
            case 4:
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();
                if (num2 == 0) {
                    System.out.println("O denominador não pode ser zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("A divisão dos números é: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida !");
                break;
        }
        input.close();
    }
}