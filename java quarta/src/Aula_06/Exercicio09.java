package Aula_06;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número aleatório entre 1 e 100
        int palpite;
        int tentativas = 0;

        System.out.println("--- JOGO DE ADIVINHAÇÃO ---");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("\nParabéns! Você acertou o número " + numeroSecreto + "!");
        System.out.println("Número de tentativas: " + tentativas);

        scanner.close();
    }
}