package ex8função;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("A média do aluno é: " + media);
    }
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}