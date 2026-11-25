package aula_2.exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        double valorDecimal = 9.87;

        int valorInteiro = (int) valorDecimal;

        System.out.println("Valor double original: " + valorDecimal);
        System.out.println("Valor int após casting explícito: " + valorInteiro);
    }
}