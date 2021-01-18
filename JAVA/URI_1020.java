package URI;

import java.util.Scanner;

public class URI_1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorInicial = scan.nextInt();
        int valor = valorInicial;

        int ano = valor/365;
        valor-= ano*365;
        int mes = valor/30;
        valor-= mes*30;
        int dia = valor;

        System.out.printf("%d ano(s)\n",ano);
        System.out.printf("%d mes(es)\n",mes);
        System.out.printf("%d dia(s)\n",dia);



    }
}
