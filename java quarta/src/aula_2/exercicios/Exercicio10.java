package aula_2.exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        short valorShort = 100;

        int valorInt = valorShort;

        byte valorByte = (byte) valorShort;

        System.out.println("Valor short original: " + valorShort);
        System.out.println("Valor int : " + valorInt);
        System.out.println("Valor byte: " + valorByte);
    }
}