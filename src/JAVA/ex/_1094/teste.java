package JAVA.ex._1094;

import java.util.Locale;

class teste {
    static int total = 2;
    static double totalDeCoelhos, totalDeRatos, totalDeSapos = 1;
    static char por = '%';
    public static void main(String[] args) {
        total = 92;
        totalDeCoelhos = 29;
        totalDeRatos = 40;
        totalDeSapos = 23;
        double porC = (totalDeCoelhos / total) * 100;
        double porR = (totalDeRatos / total) * 100;
        double porS = (totalDeSapos / total) * 100;
        String totalDeTudo = String.format(
                "Total: %d cobaias\n" +
                        "" + "Total de coelhos: %.0f\n" +
                        "" + "Total de ratos: %.0f\n" +
                        "Total de sapos: %.0f\n", total, totalDeCoelhos, totalDeRatos, totalDeSapos);
        String porcentagem = String.format(Locale.UK,
                """
                        Percentual de coelhos: %.2f %c\s
                        Percentual de ratos: %.2f %c\s
                        Percentual de sapos: %.2f %c""", porC, por, porR, por, porS, por);
        System.out.print(totalDeTudo);
        System.out.print(porcentagem);
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