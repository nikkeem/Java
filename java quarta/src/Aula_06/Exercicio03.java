package Aula_06;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int i = numero;

        if (numero > 1) {
            do {
                fatorial *= i;
                i--;
            } while (i > 1);
        }

        System.out.println("Fatorial: " + fatorial);
        scanner.close();
    }
}
