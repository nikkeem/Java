package Aula_06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Informe uma nota de 0 a 10: ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
        scanner.close();
    }
}