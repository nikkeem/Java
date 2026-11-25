package ex8função;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int resultado = dobrar(numero);

        System.out.println("O dobro de " + numero + " é: " + resultado);
    }

    public static int dobrar(int numero) {
        return numero * 2;
    }
}
