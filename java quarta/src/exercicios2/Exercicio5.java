package exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora normal (R$): ");
        double valorHora = scanner.nextDouble();

        if (horasTrabalhadas > 40) {
            double horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHora * 1.5; // 50% a mais
            double totalHorasExtras = horasExtras * valorHoraExtra;

            System.out.printf("Horas extras realizadas: %.1f horas%n", horasExtras);
            System.out.printf("Valor a ser pago pelas horas extras: R$ %.2f%n", totalHorasExtras);
        } else {
            System.out.println("Não foram realizadas horas extras.");
        }

        scanner.close();
    }
}