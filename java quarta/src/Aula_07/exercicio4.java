package Aula_07;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Média: " + media);

        scanner.close();
    }
}