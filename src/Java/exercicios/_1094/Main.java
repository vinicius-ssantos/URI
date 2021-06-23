package Java.exercicios._1094;

import java.util.Locale;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int total = 2;
        double totalDeCoelhos, totalDeRatos, totalDeSapos = 1;
        char por = '%';
        total =0;
        totalDeCoelhos = 0;
        totalDeRatos = 0;
        totalDeSapos = 0;
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        for (int x = 0; x < entrada; x++) {
            int quantidade = scan.nextInt();
            char[] tipo =  Character.toChars((scan.next().charAt(0)));
            if (tipo[0]=='\u0043'){
                totalDeCoelhos += quantidade;
                total += quantidade;
            }else if (tipo[0]=='\u0052'){
                totalDeRatos += quantidade;
                total += quantidade;
            }else if (tipo[0]=='\u0053'){
                totalDeSapos += quantidade;
                total += quantidade;
            }
        }
        double porC = (totalDeCoelhos / total)*100;
        double porR = (totalDeRatos / total)*100;
        double porS = (totalDeSapos / total)*100;
        String porcentagemC = String.format(Locale.UK, "Percentual de coelhos: %.2f %c", porC, por);
        String porcentagemR = String.format(Locale.UK, "Percentual de ratos: %.2f %c", porR, por);
        String porcentagemS = String.format(Locale.UK, "Percentual de sapos: %.2f %c", porS, por);
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %.0f\n", totalDeCoelhos);
        System.out.printf("Total de ratos: %.0f\n", totalDeRatos);
        System.out.printf("Total de sapos: %.0f\n", totalDeSapos);
        System.out.println(porcentagemC);
        System.out.println(porcentagemR);
        System.out.println(porcentagemS);
    }
}



        /*
        public  void tipoCobaia(int qtdCobaia, Character tipo) {
            switch (tipo) {
                case '\u0052':
                    totalDeRatos += qtdCobaia;
                    total += qtdCobaia;
                    break;
                case '\u0043':
                    totalDeCoelhos += qtdCobaia;
                    total += qtdCobaia;
                    break;
                case '\u0053':
                    totalDeSapos += qtdCobaia;
                    total += qtdCobaia;
                    break;
            }
        }
        */