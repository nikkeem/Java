package ex8função;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}