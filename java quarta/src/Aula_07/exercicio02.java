package Aula_07;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = new String[6];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.next();
        }

        String letra = scanner.next();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equalsIgnoreCase(letra)) {
                System.out.println("Presente na posição: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não encontrado.");
        }

        scanner.close();
    }
}