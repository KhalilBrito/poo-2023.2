/*2) Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
● O total a pagar com desconto de 10%;
● O valor de cada parcela, no parcelamento de 3× sem juros;
● A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com
desconto)
● A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)*/


import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double valorTotal, valorComDesconto, valorParcela, comissaoVista, comissaoParcelada;

    System.out.println("Digite o valor total da compra: ");
    valorTotal = input.nextDouble();

    valorComDesconto = valorTotal - (valorTotal * 0.1);
    valorParcela = valorTotal / 3;
    comissaoVista = valorComDesconto * 0.05;
    comissaoParcelada = valorTotal * 0.05;

    System.out.println("O valor total a pagar com desconto de 10% é: " + valorComDesconto);
    System.out.println("O valor de cada parcela, no parcelamento de 3× sem juros é: " + valorParcela);
    System.out.println("A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto) é: " + comissaoVista);
    System.out.println("A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total) é: " + comissaoParcelada);

}