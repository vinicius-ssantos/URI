package URI;

import java.util.Scanner;

public class URI_1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorInicial = scan.nextDouble();
        int nota = (int) valorInicial;
        int moeda = (int) ((valorInicial - nota) * 100);
        //NOTAS
        int nota100 = nota / 100;
        nota -= nota100 * 100;

        int nota50 = nota / 50;
        nota -= nota50 * 50;

        int nota20 = nota / 20;
        nota -= nota20 * 20;

        int nota10 = nota / 10;
        nota -= nota10 * 10;

        int nota5 = nota / 5;
        nota -= nota5 * 5;

        int nota2 = nota / 2;
        nota -= nota2 * 2;

        //MOEDA
        int moeda1 = nota;
        nota -= moeda1 * 1;

        int moeda50 = moeda / 50;
        moeda -= moeda50 * 50;

        int moeda25 = moeda / 25;
        moeda -= moeda25 * 25;

        int moeda10 = moeda / 10;
        moeda -= moeda10 * 10;

        int moeda5 = moeda / 5;
        moeda -= moeda5 * 5;

        int moeda01 = moeda;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00\n", nota2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moeda50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moeda25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moeda10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moeda5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moeda01);


    }
}
