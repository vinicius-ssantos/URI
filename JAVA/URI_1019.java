package URI;

import java.util.Scanner;

public class URI_1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();

        int horas = valor / 3600;
        valor -= horas * 3600;
        int minutos = valor / 60;
        valor -= minutos * 60;
        int segundos = valor;


        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);


    }
}
