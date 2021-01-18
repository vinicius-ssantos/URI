package URI;

import java.util.Scanner;

public class URI_1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int minutos = (60 * x) / 30;
        System.out.println(String.format("%d minutos", minutos));
    }
}
