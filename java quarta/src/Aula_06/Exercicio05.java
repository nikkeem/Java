package Aula_06;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        System.out.println("Média: " + (soma / 5));
        scanner.close();
    }
}