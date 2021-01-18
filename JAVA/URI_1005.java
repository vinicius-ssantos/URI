package URI;

import java.util.Scanner;

public class URI_1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();

        double media = (a * 3.5 + b * 7.5)/11;


        System.out.printf("MEDIA = %.5f" , media);

    }
}
