package exercicios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total das vendas do funcionário (R$): ");
        double vendas = scanner.nextDouble();

        double taxaComissao;
        if (vendas < 1000.0) {
            taxaComissao = 0.05;
        } else if (vendas <= 5000.0) {
            taxaComissao = 0.10;
        } else {
            taxaComissao = 0.15;
        }

        double valorComissao = vendas * taxaComissao;
        System.out.printf("Valor da comissão: R$ %.2f%n", valorComissao);

        scanner.close();
    }
}