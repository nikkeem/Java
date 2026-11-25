package Aula_06;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = numero > 1;

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }

        scanner.close();
    }
}