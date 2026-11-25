package ex8função;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.printf("O seu IMC é: %.2f\n", imc);
    }
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}