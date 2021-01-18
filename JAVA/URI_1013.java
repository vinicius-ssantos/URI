package URI;

import java.util.Scanner;

public class URI_1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.printf(maiorBC +" eh o maior\n");

    }
}
