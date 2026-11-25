package exercicios2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double valorFinal = valorCompra;
        if (valorCompra > 100.0) {
            valorFinal = valorCompra * 0.90; // Aplica 10% de desconto
        }

        System.out.printf("Valor final a ser pago: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
