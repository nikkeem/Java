package exercicios2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Situação: Em recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

        scanner.close();
    }
}
