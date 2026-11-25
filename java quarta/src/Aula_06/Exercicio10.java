package Aula_06;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite números inteiros (número negativo para encerrar):");

        while (true) {
            System.out.print("Digite um número: ");

            int numero = scanner.nextInt();

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Números pares digitados: " + pares);
        System.out.println("Números ímpares digitados: " + impares);

        scanner.close();
    }
}
