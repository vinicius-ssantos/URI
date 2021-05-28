package JAVA.ex._1117;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        while ((lista.size()) != (2)) {
            double valor1 = scan.nextDouble();

            if (valor1 >= 0 & valor1 <= 10) {
                lista.add(valor1);
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = " + (lista.get(0)+lista.get(1))/2);
    }
}
