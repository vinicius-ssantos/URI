package URI;

import java.util.Scanner;

public class URI_1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        double R1 = ((B * -1) + Math.sqrt(delta)) / (2 * A);
        double R2 = ((B * -1) - Math.sqrt(delta)) / (2 * A);

        if (A == 0 || C == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }


    }
}
