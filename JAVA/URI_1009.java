package URI;

import java.util.Scanner;

public class URI_1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        double sal = scan.nextDouble();
        double tot = scan.nextDouble();

        tot *= 0.15;
        sal += tot;

        System.out.printf("TOTAL = R$ %.2f\n", sal);
    }
}
