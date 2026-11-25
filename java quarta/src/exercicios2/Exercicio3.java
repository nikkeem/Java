package exercicios2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 - Eletrônicos, 2 - Alimentos, 3 - Vestuário): ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Categoria: Eletrônicos");
                break;
            case 2:
                System.out.println("Categoria: Alimentos");
                break;
            case 3:
                System.out.println("Categoria: Vestuário");
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }

        scanner.close();
    }
}