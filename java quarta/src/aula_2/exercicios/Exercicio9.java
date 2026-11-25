package aula_2.exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        float valorFloat = 123.75f;

        long valorLong = (long) valorFloat;

        double valorDouble = valorLong;

        System.out.println("Valor float original: " + valorFloat);
        System.out.println("Valor long (casting explícito): " + valorLong);
        System.out.println("Valor double (casting implícito): " + valorDouble);
    }
}