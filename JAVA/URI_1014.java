package URI;

import java.util.Scanner;

public class URI_1014 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        double y = scan.nextDouble();

        double media = x / y;

        System.out.println(String.format("%.3f km/l", media));


    }
}
