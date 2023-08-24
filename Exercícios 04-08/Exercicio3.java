/*3) A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso.
Sendo que da quantia total:
● O primeiro ganhador recebera 46%;
● O segundo recebera 32%;
● O terceiro recebera o restante.
Calcule e imprima a quantia ganha por cada um dos ganhadores */

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double premio, primeiro, segundo, terceiro;

        System.out.println("Digite o valor do prêmio: ");
        premio = input.nextDouble();

        primeiro = premio * 0.46;
        segundo = premio * 0.32;
        terceiro = premio - (primeiro + segundo);

        System.out.println("O primeiro ganhador receberá: " + primeiro);
        System.out.println("O segundo ganhador receberá: " + segundo);
        System.out.println("O terceiro ganhador receberá: " + terceiro);
        
    }
}