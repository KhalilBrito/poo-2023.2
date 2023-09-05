/*2) Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não se
aposentar. As condições para aposentadoria são
• Ter pelo menos 65 anos,
• Ou ter trabalhado pelo menos 30 anos,
• Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, tempoServico;

        System.out.print("Digite a idade: ");
        idade = input.nextInt();
        System.out.print("Digite o tempo de serviço: ");
        tempoServico = input.nextInt();

        if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Não pode se aposentar");
        }
        input.close();
    }
}