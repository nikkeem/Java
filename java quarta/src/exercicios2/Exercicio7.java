package exercicios2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
