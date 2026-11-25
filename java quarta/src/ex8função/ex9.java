package ex8função;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base:");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        long resultado = calcularPotencia(base, expoente);

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }
    public static long calcularPotencia(int base, int expoente) {
        return (long) Math.pow(base, expoente);
    }
}