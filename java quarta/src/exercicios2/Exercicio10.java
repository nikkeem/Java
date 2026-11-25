package exercicios2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Libra (GBP)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double cotacaoDolar = 5.00;
        double cotacaoEuro = 5.50;
        double cotacaoLibra = 6.50;

        switch (opcao) {
            case 1:
                double valorDolar = valorReais / cotacaoDolar;
                System.out.printf("Valor convertido: $ %.2f USD%n", valorDolar);
                break;
            case 2:
                double valorEuro = valorReais / cotacaoEuro;
                System.out.printf("Valor convertido: € %.2f EUR%n", valorEuro);
                break;
            case 3:
                double valorLibra = valorReais / cotacaoLibra;
                System.out.printf("Valor convertido: £ %.2f GBP%n", valorLibra);
                break;
            default:
                System.out.println("Opção de moeda inválida.");
                break;
        }

        scanner.close();
    }
}