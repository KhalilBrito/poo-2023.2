/*3) A sequência de Fibonacci tem papel importante na explicação de fenômenos naturais.
Ela é também bastante utilizada para fins estéticos, pela sua reconhecida harmonia.
Exemplo disso foi sua utilização na construção do Partenon, em Atenas. A sequência dá-se
inicialmente por dois números 1. A partir do terceiro elemento usa-se a expressão:
elementon = elementon-1 + elementon-2. Exemplo de sequência: 1, 1, 2, 3, 5, 8. Construa
um algoritmo que imprima na tela os n primeiros elementos da sequência de Fibonacci,
onde n é informado pelo usuário. */

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe quantos números da sequência de Fibonacci você deseja gerar: ");
        int n = input.nextInt();

        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
            System.out.print(fibonacci[0] + " ");
        }

        if (n >= 2) {
            fibonacci[1] = 1;
            System.out.print(fibonacci[1] + " ");
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }

        input.close();
    }
}
