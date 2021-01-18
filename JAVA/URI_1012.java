package URI;

import java.util.Scanner;

public class URI_1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double pi = 3.14159;
        double triangulo = (a * c) / 2;
        double raio = pi * (c * c);
        double trapezio = (a + b) / 2 * c;
        double quadrado = (b * b);
        double retangulo = (a * b);

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", raio);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }

}
