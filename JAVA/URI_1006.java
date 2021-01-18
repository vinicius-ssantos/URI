package URI;

import java.util.Scanner;

public class URI_1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double c = scan.nextFloat();

        double media = (a * 2 + b * 3 + c * 5) / 10;


        System.out.printf("MEDIA = %.1f", media);

    }
}
