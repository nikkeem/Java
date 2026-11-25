package ex8função;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        int maior = maiorNumero(num1, num2, num3);

        System.out.println("O maior número entre " + num1 + ", " + num2 + " e " + num3 + " é: " + maior);
    }
    public static int maiorNumero(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}