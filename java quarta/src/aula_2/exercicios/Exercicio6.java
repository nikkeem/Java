package aula_2.exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int numeroA = 15;
        int numeroB = 20;

        System.out.println("Número A: " + numeroA);
        System.out.println("Número B: " + numeroB);
        System.out.println("---------------------------");

        System.out.println("A > B  (A é maior que B?): " + (numeroA > numeroB));
        System.out.println("A < B  (A é menor que B?): " + (numeroA < numeroB));
        System.out.println("A >= B (A é maior ou igual a B?): " + (numeroA >= numeroB));
        System.out.println("A <= B (A é menor ou igual a B?): " + (numeroA <= numeroB));
        System.out.println("A == B (A é igual a B?): " + (numeroA == numeroB));
        System.out.println("A != B (A é diferente de B?): " + (numeroA != numeroB));
    }
}