package Aula_07;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] vetor = new boolean[8];
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextBoolean();
            if (vetor[i]) {
                contador++;
            }
        }

        System.out.println("Quantidade de true: " + contador);

        scanner.close();
    }
}