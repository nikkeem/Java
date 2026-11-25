package Aula_06;

public class Exercicio06 {
    public static void main(String[] args) {
        int count = 0;
        int a = 0, b = 1;

        while (count < 10) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            count++;
        }
        System.out.println();
    }
}