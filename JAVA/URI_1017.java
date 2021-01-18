package URI;

import java.util.Scanner;

public class URI_1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas = scan.nextInt();
        int velMedia = scan.nextInt();
        double distancia = horas * velMedia;
        double litros = distancia / 12;
        System.out.printf("%.3f\n", litros);
    }
}
