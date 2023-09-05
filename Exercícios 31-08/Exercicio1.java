/*1) A prefeitura de Tianguá fez uma pesquisa entre seus habitantes, coletando dados sobre o
salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$1000,00.
O final da leitura de dados se dará com a entrada de um salário negativo. (Use o comando
while) */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, mediaSalario, mediaFilhos, maiorSalario, percentual;
        int filhos, cont, cont2;
        salario = 0;
        filhos = 0;
        cont = 0;
        cont2 = 0;
        maiorSalario = 0;
        mediaSalario = 0;
        mediaFilhos = 0;
        percentual = 0;
        while (salario >= 0) {
            System.out.println("Digite o seu salário: ");
            salario = input.nextDouble();
            if (salario >= 0) {
                System.out.println("Digite o número de filhos: ");
                filhos = input.nextInt();
                cont++;
                mediaSalario = mediaSalario + salario;
                mediaFilhos = mediaFilhos + filhos;
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }
                if (salario <= 1000) {
                    cont2++;
                }
            }
        }
        mediaSalario = mediaSalario / cont;
        mediaFilhos = mediaFilhos / cont;
        percentual = (cont2 * 100) / cont;
        System.out.println("A média do salário da população é: " + mediaSalario);
        System.out.println("A média do número de filhos é: " + mediaFilhos);
        System.out.println("O maior salário é: " + maiorSalario);
        System.out.println("O percentual de pessoas com salário até R$1000,00 é: " + percentual + "%");

        input.close();
    }
}