package Aula_07;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.next();
        }

        String busca = scanner.next();
        boolean presente = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("O nome está presente no vetor.");
        } else {
            System.out.println("O nome não está presente no vetor.");
        }

        scanner.close();
    }
}