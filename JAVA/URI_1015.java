package URI;

import java.util.Scanner;

public class URI_1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double p1 = (x2 - x1) * (x2 - x1);
        double p2 = (y2 - y1) * (y2 - y1);
        double distancia = Math.sqrt(p1 + p2);

        System.out.printf("%.4f\n", distancia);
    }
}
