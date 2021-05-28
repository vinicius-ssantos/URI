package JAVA.ex._1094;

import java.util.Locale;
import java.util.Scanner;


class Main {

    static int total = 2;
    static double totalDeCoelhos, totalDeRatos, totalDeSapos = 1;
    static char por = '%';

    public static void main(String[] args) {
        total =0;
        totalDeCoelhos = 0;
        totalDeRatos = 0;
        totalDeSapos = 0;
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        for (int x = 0; x < entrada; x++) {
            int quantidade = scan.nextInt();
            String arr = scan.next();
            tipoCobaia(quantidade, arr);
        }
        double porC = (totalDeCoelhos / total)*100;
        double porR = (totalDeRatos / total)*100;
        double porS = (totalDeSapos / total)*100;
        String porcentagemC = String.format(Locale.UK, "Percentual de coelhos: %.2f %c ", porC, por);
        String porcentagemR = String.format(Locale.UK, "Percentual de ratos: %.2f %c ", porR, por);
        String porcentagemS = String.format(Locale.UK, "Percentual de sapos: %.2f %c ", porS, por);

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %.0f\n", totalDeCoelhos);
        System.out.printf("Total de ratos: %.0f\n", totalDeRatos);
        System.out.printf("Total de sapos: %.0f\n", totalDeSapos);
        System.out.println(porcentagemC);
        System.out.println(porcentagemR);
        System.out.println(porcentagemS);

    }

    public static void tipoCobaia(int qtdCobaia, String tipo) {
        switch (tipo) {
            case "R":
                totalDeRatos += qtdCobaia;
                total += qtdCobaia;
                break;
            case "C":
                totalDeCoelhos += qtdCobaia;
                total += qtdCobaia;
                break;
            case "S":
                totalDeSapos += qtdCobaia;
                total += qtdCobaia;
                break;
        }
    }
}