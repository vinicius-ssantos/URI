package URI;

import java.util.Scanner;

public class URI_1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double intervalo = scan.nextDouble();

        if (intervalo < 0 || intervalo > 100.00) {
            System.out.println("Fora de intervalo");

        } else if (intervalo <= 25.00) {
            System.out.println("Intervalo [0,25]");

        } else if (intervalo <= 50.00) {
            System.out.println("Intervalo (25,50]");

        } else if (intervalo <= 75.00) {
            System.out.println("Intervalo (50,75]");

        } else if (intervalo <= 100.00) {
            System.out.println("Intervalo (75,100]");
        }
    }
}
