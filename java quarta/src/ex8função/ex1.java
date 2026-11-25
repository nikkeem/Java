package ex8função;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        int lado = scanner.nextInt();

        int areaDoQuadrado = calcularAreaDoQuadrado(lado);
        System.out.println("Area do Quadrado = "+ areaDoQuadrado);
    }

    public static int calcularAreaDoQuadrado(int lado){
        return lado*lado;
    }

}