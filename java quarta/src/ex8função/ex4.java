package ex8função;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = converterCelsiusParaFahrenheit(celsius);

        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F");
    }
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
