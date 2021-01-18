package URI;

import java.util.Scanner;

public class URI_1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double raio = (4.0 / 3) * 3.14159 * (n * n * n);
        System.out.printf("VOLUME = %.3f\n", raio);

    }
}
