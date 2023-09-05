/*1) Crie um programa, que a partir de uma String digitada pelo usuário, imprima
a) O número de caracteres da string.
b) A string com todas suas letras em maiúsculo.
c) O número de vogais da string.
d) Se a string digitada começa com “IF” (ignorando maiúsculas/minúsculas).
e) Se a string é um palíndromo ou não. */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra;
        int qtdCaracteres = 0, qtdVogais = 0;
        boolean palindromo = true;

        System.out.println("Digite uma palavra: ");
        palavra = input.nextLine();

        //a)
        qtdCaracteres = palavra.length();
        System.out.println("Quantidade de caracteres: " + qtdCaracteres);

        //b)
        System.out.println("Palavra em maiúsculo: " + palavra.toUpperCase());

        //c)
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                qtdVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + qtdVogais);

        //d)
        if (palavra.substring(0, 2).equalsIgnoreCase("if")) {
            System.out.println("A palavra começa com IF");
        } else {
            System.out.println("A palavra não começa com IF");
        }

        //e)
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }

        input.close();
    }
}
